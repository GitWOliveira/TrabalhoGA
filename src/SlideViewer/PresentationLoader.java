package SlideViewer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PresentationLoader {    
    
    public Presentation loader(String filename) throws Exception{
        
        //Leitura do arquivo
        FileReader fr = new FileReader(filename);
        BufferedReader in = null;
        in = new BufferedReader(fr);
        String line;
        
        //Montando o slides
        Slide slides[] = new Slide[4];
        Footer fo = null;
        Presentation p = new Presentation(2,slides);
        
        try {
            while ((line = in.readLine()) != null) {
                if("".equals(line)) {
                } // pula linha em branco
                else if("/presentation".equals(line)){
                   break;                 
                }
                //Ajustes do style
                else if(line.startsWith("style=")){
                    Style st = readStyle(line);
                    if(st != null){
                        p.addStyle(st);
                    }
                }             
                //Ajuste footer
                else if(line.startsWith("left=") || line.startsWith("right")){
                    fo = readFooter(line,fo);
                    if(fo != null){
                        p.setFoo(fo);
                    }
                }
                //Ajuste Slide
                else if(line.startsWith("title=") || line.startsWith("0") || line.startsWith("*")){
                    slides = readSlide(line,slides,p);
                }
            
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo \"" + filename + "\" não existe.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + filename + ".");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return p;
    }
    
    public Style readStyle(String lines){
        if("styles".equals(lines)){
            return null;
        }
        if(lines.startsWith("style=")){
            Style s = new Style(lines);
            return s;
        }
        else{
            return null;
        } 
    }
    
    public Footer readFooter(String lines,Footer f){
        try{
            if(f == null){
                f = new Footer(lines);
            }
            else{
                f.setRight(lines);
            }
            return f;
        }
        catch(Exception e){
            System.out.println("Digite um numero válido");
            return null;
        }
    }
    
    public Slide[] readSlide(String lines,Slide[] s,Presentation p){
        
        if(lines.startsWith("title")){
            String titulo = lines.substring(6);
            Title t = new Title(titulo);
            int i;
            for(i = 0;i < s.length;i++){
                if(s[i].getTitle() == null){
                   s[i].setTitle(t);
                   break;
                }
            }       
        }
        
        if(lines.contains("style")){
            for(int i = 0;i < s.length;i++){
                if(s[i].getStyle() == null){
                    if(lines.startsWith("0"))
                      s[i].setStyle(p.getStyle(0));
                    else{
                      s[i].setStyle(p.getStyle(1));
                    }
                }
            }
        }
        
        if(lines.contains("*")){
            
        }
        
        return s;
    }
}
    
    

