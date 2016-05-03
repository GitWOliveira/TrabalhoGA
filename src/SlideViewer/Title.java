package SlideViewer;

public class Title extends Element{
    private boolean capital = true; 
    private String titulo;
    
    public Title(String titulo){
        if(titulo == null || "".equals(titulo.trim())){
            capital = false;
            print(capital);
        }else{
            capital = true;
            this.titulo = titulo;
            print(capital);
        }
    }
    
    public String print(boolean capital){        
        if(capital == true)
            return this.titulo;
        else 
            return "";
    }
}
