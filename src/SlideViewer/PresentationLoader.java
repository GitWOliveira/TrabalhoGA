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
        Footer fo;
        Presentation p = new Presentation(2,slides);
        String concatenar = null;
        
        try {
            while ((line = in.readLine()) != null) {
                if("".equals(line)) {
                } // pula linha em branco
                else if("/presentation".equals(line)){
                   break;                 
                }
                //Ajustes do style
                else if("style".equals(line) || "/style".equals(line)){
                    Style st = readStyle(line);
                    if(st != null){
                        p.addStyle(st);
                    }
                }             
                //Ajuste footer
                else if(line.startsWith("left=") || line.startsWith("right")){
                    fo = readFooter(line);
                    if(fo != null){
                        p.setFoo(fo);
                    }
                }
                //Ajuste Slide
                else if("/slide".equals(line)){                                    
                }
                else if("slide".equals(line)){                   
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
        else if(lines.startsWith("styles=")){
            Style s = new Style(lines);
            return s;
        }
        else{
            return null;
        } 
    }
    
    public Footer readFooter(String lines){
        try{
            Footer f = new Footer(lines);
            return f;
        }
        catch(Exception e){
            System.out.println("Digite um numero válido");
            return null;
        }
    }
}
    
    

