package SlideViewer;

public class Title extends Element{
    private boolean capital = false; 

    public Title(String e) {
        super(e);
    }
    
    @Override
    public String print(){        
        if(capital == true)         
            return super.print();
        else        
            return super.getText().toUpperCase();
    }
}
