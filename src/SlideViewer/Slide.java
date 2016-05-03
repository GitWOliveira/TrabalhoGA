package SlideViewer;

public class Slide implements Printable {
    private Element elem;
    private Title title;   
    private Style style;
    
    public Slide(Element line,Style s){
        this.title = new Title(line);
        this.style = s;
    }

    public Element getElem() {
        return elem;
    }

    public void setElem(Element elem) {
        this.elem = elem;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
    
    
   public void addElement(Element elem){
       this.elem = elem;       
   }
   
   public String print(){
       return "";
   }
   
}
