package SlideViewer;

public class Presentation {
    private Style style;

    public void addStyle(Style style) {
        this.style = style;
    }

    public Style getStyle(int index) {
        return style;
    }

}
