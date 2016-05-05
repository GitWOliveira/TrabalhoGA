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
    
    public String marcadores(String line){
        int numerador=0, i=0;
        char letras = 'i';        
        
            if(line.startsWith("#")){
               numerador = numerador++;
               line = numerador + line.substring(1);
            }
            //Usar a notação ASCCI para obter as lettras, sendo que 65 é "A", podemos ir adicionando de acordo com o order.
            else if(line.startsWith("## ")){
               letras = vetorLetras[order];
               line = "/t" + Character.toString(letras) + line.substring(3);
            }
            else if(line.startsWith("** ")){
                line = "/t" + line;
            }
            return line;
        }
}

