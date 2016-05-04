package SlideViewer;

public class Presentation {
    private Style style[];
    private int cont;
    private Footer foo;
    private Slide[] slide;

    //Quantidades de Styles que o presentation pode ter.
    public Presentation(int cont,Slide[] s) {
        style = new Style[cont];
        this.slide = s;
    }
   
    public void addStyle(Style st) {
        if(st != null){
            if(cont < style.length){
                style[cont] = st; 
                cont++;
            }
        }           
    }

    public Slide[] getSlide() {
        return slide;
    }

    public void setSlide(Slide[] slide) {
        this.slide = slide;
    }

    public Style getStyle(int index) {
        return style[index];
    }

    public Footer getFoo() {
        return foo;
    }

    public void setFoo(Footer foo) {
        this.foo = foo;
    }
}
