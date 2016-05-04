
package SlideViewer;


public class Footer extends Element{
    private String left;
    private String right;

    public Footer(String e) {
        super(e);
        if(super.getText().startsWith("left")){
            setLeft(super.getText());
        }
        else if(super.getText().startsWith("rigth")){
            setRight(super.getText());
        }
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
        String Format = String.format("|%1$-10s %2$30s",left,right);
        return Format;
    }    
    
}
