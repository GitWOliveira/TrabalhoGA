package SlideViewer;

public class Presentation {
    private Style style[];
    private int cont;
   
    public void addStyle(Style st) {
        if(st != null){
            if(cont < style.length){
                style[cont] = st; 
                cont++;
            }
        }           
    }

    public Style getStyle(int index) {
        return style[index];
    }

}
