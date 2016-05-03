package SlideViewer;

public class Slide implements Printable {
    private Element elem;
    private Title title;   
    private Style style;
    
    public Slide(Element line,Style s){
        this.title = new Title(line);
        this.style = s;
    }
    
   public void addElement(Element elem){
       this.elem = elem;       
   }
   
   public String print(){
       return "";
   }
   
}
