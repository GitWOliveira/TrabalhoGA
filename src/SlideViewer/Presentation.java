package SlideViewer;

public class Presentation {
    private Style style[];
    private int cont;

    //Quantidades de Styles que o presentation pode ter.
    public Presentation(int cont) {
        style = new Style[cont];
    }
   
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
