package SlideViewer;

public class ListIthem extends Element {
    private boolean numbered;
    private int order;
    private char vetorLetras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public ListIthem(boolean numbered, int order, String e) {
        super(e);
        this.numbered = numbered;
        this.order = order;
    }
    
    public boolean isNumbered() {
        return numbered;
    }

    public void setNumbered(boolean numbered) {
        this.numbered = numbered;
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
        String[] linha = line.split(" ");
        
        if("#".equals(linha[0]))
            numerador = numerador+1;
        else if("##".equals(linha[0]))
            letras = vetorLetras[i++]; 
    }
    
}
