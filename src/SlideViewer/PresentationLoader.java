package SlideViewer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PresentationLoader {    
    
    public Presentation loader(String filename) throws Exception{
        
        //Leitura do arquivo
        FileReader fr = new FileReader(filename);
        BufferedReader in;
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
                else if("styles".equals(line)){
                    readStyle(line, in,p);
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
    
    public void readStyle(String lines,BufferedReader in,Presentation p){
        try{
            while ((lines = in.readLine()) != null){
        
                if("/styles".equals(lines)){
                    break;
                }
                if(lines.startsWith("style=")){
                    lines = lines.substring(6);
                    String[] cores = lines.split(";");
                    Style s = new Style(cores[0],cores[1],cores[2],cores[3]); 
                    p.addStyle(s);
                }
            }
            } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo.");
            } finally {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            ListIthem list = new ListIthem(lines);
            for(int i = 0;i < s.length;i++){
                for(int j=0;j < s[i].getElem().length;j ++){
                   if(s[i].getElem(j) == null) 
                    s[i].addElement(list.marcadores(lines));
                   break;
                }

            }
        }
        
        else if(lines.startsWith("0") || lines.startsWith("1")){
            for(int i = 0;i < s.length;i++){
                if(s[i].getStyle() == null && lines.startsWith("0")){
                    s[i].setStyle(p.getStyle(0));
                }
                else{
                   s[i].setStyle(p.getStyle(1)); 
                }
            }
         }
        
        else if(lines.startsWith("#") || lines.startsWith("##")){
            
        }
        return s;
    }
}
    
    

