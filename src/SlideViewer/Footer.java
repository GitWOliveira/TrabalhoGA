
package SlideViewer;


public class Footer extends Element{
    private String left;
    private String right;

    public Footer(String left, String right, String center) {
        //Será o center
        super(center);
        this.left = left;
        this.right = right;
    }
    
    public String getLeft() {
        return left;
    }
     
    public void setLeft(String left) {
        try{
          this.left = left;
        }
        catch(Exception e){
            System.out.println("Digite um valor válido");
        }
    }
    
    public void setCenter(String center){
        try{
            super.setText(center);
        }
        catch(Exception e){
            System.out.println("Digite um valor válido");
        }
    }
    
    public String getCenter(){
        return super.getText();
    }
    
    public String getRight() {
           return right;
    }

    public void setRight(String right) {
        try{
            this.right = right;
        }
        catch(Exception e){
            System.out.println("Digite uma entrada válida");
        }
    }
    
    
     
    @Override
    public String print(){
        String Format = String.format("|%1$-10s %2$30s %3$50s",left,super.getText(),right);
        return Format;
    }    
    
}
