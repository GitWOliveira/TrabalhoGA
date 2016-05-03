package SlideViewer;

public class ListIthem extends Element {
    private boolean numbered;
    private int order;

    public ListIthem(boolean numbered, int order, String e) {
        super(e);
        this.numbered = numbered;
        this.order = order;
    }
    
    public boolean isNumbered() {
        return numbered;
    }

    public void setNumbered(boolean numbered) {
        this.numbered = numbered;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
    
}
