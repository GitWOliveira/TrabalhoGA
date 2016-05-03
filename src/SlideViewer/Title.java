package SlideViewer;

public class Title extends Element{
    private boolean capital = true; 
    private Element titulo;
    
    public Title(Element titulo){
        if(titulo == null){
            capital = false;
            print(capital);
        }else{
            capital = true;
            this.titulo = titulo;
            print(capital);
        }
    }
    
    public Element print(boolean capital){        
        if(capital == true)
            return this.titulo;
        else 
            return null;
    }
}
