
package SlideViewer;


public class Footer extends Element{
    private String left;
    private String right;

    public Footer(String left, String right, String e) {
        //Será o center
        super(e);
        this.left = left;
        this.right = right;
    }
    
    public String getLeft() {
        return left;
    }
    
    public void setLeft(String left) {
        try{
          this.left = left.substring(5);
        }
        catch(Exception e){
            System.out.println("Digite um valor válido");
        }
    }

    public String getRight() {
           return right;
    }

    public void setRight(String right) {
        try{
            this.right = right.substring(6);
        }
        catch(Exception e){
            System.out.println("Digite um ");
        }
    }
    
    
     
    @Override
    public String print(){
        String Format = String.format("|%1$-10s %2$30s %3$50s",left,super.getText(),right);
        return Format;
    }    
    
}
