package SlideViewer;

public class Slide {
    private Element elem;
    private String title;
    private int style;
    
    public Slide(String line){
        line = line.substring(6);
        String[] cores = line.split(" ");
        this.title = cores[0];
        String temp = cores[1];
        this.style = Integer.valueOf(temp); 
    }
    
   public void addElement(Element elem){
       this.elem = elem;       
   }
   
}
