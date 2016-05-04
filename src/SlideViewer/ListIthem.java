package SlideViewer;

public class ListIthem extends Element {
    private boolean numbered;
    private int order;
    private char vetorLetras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public ListIthem(String e) {
        super(e);
    }
    
    public boolean isNumbered() {
        if(numbered){
            return true;
        }
        else{
            return false;
        }
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }    
    
    public void marcadores(String line){
        int numerador=0, i=0;
        char letras;        
        
            if(line.startsWith("#")){
                numerador = numerador++;
                line = numerador + line.substring(1);
            }
            else if(line.startsWith("## "))
                letras = vetorLetras[i++];
        }
    
    
}
