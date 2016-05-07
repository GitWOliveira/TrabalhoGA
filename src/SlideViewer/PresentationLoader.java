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
        
        //Quantidade de slides
        Slide slides[] = new Slide[4];
        //Variavel que será montada e retornada pelo método
        Presentation p = null;
        
        try {
            while ((line = in.readLine()) != null) {
                if("".equals(line)) {
                } // pula linha em branco
                else if("/presentation".equals(line)){
                   break;                 
                }
                else if("presentation".equals(line)){
                    p = new Presentation(2,slides);
                }
                //Ajustes do style
                else if("styles".equals(line)){
                    readStyle(in,p);
                }             
                //Ajuste footer
                else if("footer".equals(line)){
                    readFooter(in,p);
                }
                //Ajuste Slide
                else if("slide".equals(line)){
                   readSlide(in,p);
                }
            
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo \"" + filename + "\" não existe.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + filename + "." + e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Erro ao criar a apresentação");
            }
        }
        return p;
    }
    
    public void readStyle(BufferedReader in,Presentation p){
        String lines;
        try{
            while ((lines = in.readLine()) != null){
        
                if("/styles".equals(lines)){
                    break;
                }
                if(lines.startsWith("style=")){
                    lines = lines.substring(6);
                    String[] cores = lines.split(";");
                    Style s = new Style(cores[1],cores[2],cores[3],cores[4]); 
                    p.addStyle(s);
                }
            }
            } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo.");
            } 
    }

    public void readFooter(BufferedReader in,Presentation p){
        String lines;
        Footer f = new Footer("","","");
        
        try{
            while ((lines = in.readLine()) != null){
        
                if("/footer".equals(lines)){
                    break;
                }         
                
                if(lines.startsWith("left=")){
                  f.setLeft(lines.substring(5));
                }
                else if(lines.startsWith("center=")){
                  f.setCenter(lines.substring(7));
                }
                else if(lines.startsWith("right=")){
                  f.setRight(lines.substring(6));
                }
            }
        p.setFoo(f);
        } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo.");
        }
    }
    
    public void readSlide(BufferedReader in,Presentation p){
        String lines;
        
//        if(lines.startsWith("title")){
//            String titulo = lines.substring(6);
//            Title t = new Title(titulo);
//            int i;
//            for(i = 0;i < s.length;i++){
//                if(s[i].getTitle() == null){
//                   s[i].setTitle(t);
//                   break;
//                }
//            }       
//        }
//        
//        if(lines.contains("style")){
//            for(int i = 0;i < s.length;i++){
//                if(s[i].getStyle() == null){
//                    if(lines.startsWith("0"))
//                      s[i].setStyle(p.getStyle(0));
//                    else{
//                      s[i].setStyle(p.getStyle(1));
//                    }
//                }
//            }
//        }
//        
//        if(lines.contains("*")){
//            ListIthem list = new ListIthem(lines);
//            for(int i = 0;i < s.length;i++){
//                for(int j=0;j < s[i].getElem().length;j ++){
//                   if(s[i].getElem(j) == null) 
//                    s[i].addElement(list.marcadores(lines));
//                   break;
//                }
//
//            }
//        }
//        
//        else if(lines.startsWith("0") || lines.startsWith("1")){
//            for(int i = 0;i < s.length;i++){
//                if(s[i].getStyle() == null && lines.startsWith("0")){
//                    s[i].setStyle(p.getStyle(0));
//                }
//                else{
//                   s[i].setStyle(p.getStyle(1)); 
//                }
//            }
//         }
//        
//        else if(lines.startsWith("#") || lines.startsWith("##")){
//            
//        }
    }
}
    
    

