package SlideViewer;

public class Navigator<E> {
    protected E[] elements;
    int numElements;
    private int current;
    
    public Navigator(int maxSize){
        elements = (E[])new Object[maxSize];
        numElements = 0;
    }
    
    public void first(){
        current = 0;   
    }
    
    public void next(){
        if(current < numElements)
            current += 1;
        else
            throw new IllegalArgumentException("Não é possivel depositar um valor negativo! ");       
    }
    
    public void previous(){
        if(current > 0)
            current -=1;
        else
            throw new IllegalArgumentException("Não é possivel depositar um valor negativo! ");
    }
    
    public void last(){
        current = numElements;
    }
    
    public void Goto(int index){
        if(index > 0 && index < numElements)
            current = index;
        else
         throw new IllegalArgumentException("Não é possivel depositar um valor negativo! ");   
    }
    
    public Slide getCurrent(){
        if (current < 0  ||  current >= numElements)
            throw new IndexOutOfBoundsException();
  	return (Slide)elements[current];
    }
}
