package SlideViewer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PresentationLoader {    
    
    public void loaderPresentation() throws Exception{    
       String filename = "presentation.txt";
        BufferedReader in = null;
        try {
            FileReader fr = new FileReader(filename);
            in = new BufferedReader(fr);
            String line;
            while ((line = in.readLine()) != null) {
                if("".equals(line)) 
                    continue; // pula linha em branco!!
                else if("/presentation".equals(line)){
                   break;                 
                }
                else if("presentation".equals(line)){
                    continue;                                       
                }
                else if("/styles".equals(line)){
                    
                }
                else if("styles".equals(line)){
                    Style estilo = new Style(line);
                } 
                else if("/footer".equals(line)){
                    continue;                    
                }
                else if("footer".equals(line)){
                    Footer footer = new Footer(line);
                }
                else if("/slide".equals(line)){
                    continue;                    
                }
                else if("slide".equals(line)){
                    Slide slide = new Slide(line);
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
    }
}
    
    

