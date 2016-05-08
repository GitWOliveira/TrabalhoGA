package SlideViewer;

public class ListIthem extends Element {
    private boolean numbered;
    private int order;

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
    
    public String marcadores(){
        String line = super.getText();
        
            if(line.startsWith("#")){
               line = order + ". " + line.substring(1);
            }
            //Usar a notação ASCCI para obter as lettras, sendo que 65 é "A", podemos ir adicionando de acordo com o order.
            else if(line.startsWith("#",1)){
               int letra =97;
               char letras = (char)letra;
               line = "/t" + Character.toString(letras) + " " + line.substring(2);
            }
            else if(line.startsWith(" ",2)){
                line = "/t" + line;
            }
            return line;
        }
}

