package SlideViewer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PresentationLoader {    
    
    public Presentation loader(String filename) throws Exception{
        //Dois estilos para a apresentação
        Presentation p = new Presentation(2);
        //Determinar onde inicia cada parte.     
        Boolean beginStyle;
        Boolean beginSlide;
        Boolean beginFooter;
        Boolean beginContend;
        //Povoar as classes
        Slide slides[] = new Slide[4];
        //Navegador de slides
        Navigator nav = new Navigator(slides);
        //Ler arquivo;
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
                //Ajustes do style
                else if("/styles".equals(line)){
                    beginStyle = false;
                }
                else if("Styles".equals(line)){
                    beginStyle = true;
                }
                else if(line.startsWith("style=")){
                    if(beginStyle = true){
                        Style s = new Style(line);
                        p.addStyle(s);
                    }
                }            
                //Ajuste footer
                else if("/footer".equals(line)){
                    beginFooter = false;                   
                }
                else if("footer".equals(line)){
                    beginFooter = true;
                }
                else if(beginFooter = true){
                    if(p.getFoo() == null){
                        Footer ft = new Footer(line);
                        p.setFoo(ft);
                    }
                    else{
                        
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
}
    
    

