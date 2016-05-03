package SlideViewer;

public class Element implements Printable {
    private String text;
   
    public Element(String e){
        try{
            this.text = e;
            print();
        }
        catch(NullPointerException n){
            System.out.println("Valores inválido, digite um valor correto");
        }
        catch(Exception x){
            System.out.println("Digite um valor de acordo com o padrõa");
        }
    }
    
    public void setText(String n){
        try{
            this.text = n;
        }
        catch(Exception e){
            System.out.println("Digite um valor válido");
        }
    }

    public String getText() {
        return text;
    }
    
    public String print(){
        return text;    
    }
    
}
