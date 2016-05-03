package SlideViewer;

public class Navigator<E> {
    
    protected E[] elements;
    int numElements;
    private int current;
    
    public Navigator(E[] el){
        elements = (E[])new Object[el.length];
        numElements = 0;
    }
    

    
    public void first(){
        getCurrent();   
    }
    
    public void next(){
        if(current < numElements){
            current += 1;
            getCurrent();
        }
        else{
            throw new IllegalArgumentException("Não é possivel avançar"); 
        }
    }
    
    public void previous(){
        if(current > 0){
            current -=1;
            getCurrent();
        }
        else{
            throw new IllegalArgumentException("Não é possivel retroceder");
        }
    }
    
    public void last(){
        current = numElements;
        getCurrent();
    }
    
    public void Goto(int index){
        if(index > 0 && index < numElements){
            current = index;
            getCurrent();
        }
        else{
         throw new IllegalArgumentException("Não é possivel se mover para essa posição");  
        }
    }
    
    public Slide getCurrent(){
        if (current < 0  ||  current >= numElements)
            throw new IndexOutOfBoundsException();
  	return (Slide)elements[current];
    }
    
    public int getCurrentIndex(){
        return current;
    }
}
