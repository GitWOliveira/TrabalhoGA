package SlideViewer;

public class Title extends Element{
    private boolean capital = true; 

    public Title(String e) {
        super(e);
        print();
    }
    
    @Override
    public String print(){        
        if(capital == true)
            
            return super.print();
        else 
            return null;
    }
}
