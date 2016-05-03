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
    
    public String print(){
        return text;    
    }
    
}
