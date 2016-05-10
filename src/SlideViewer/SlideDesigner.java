package SlideViewer;

public class SlideDesigner {
    
    public String drawSlide(Slide slide,int page,Footer footer){
        StringBuilder drawAll = new StringBuilder();

        drawAll.append(drawTitle(slide.getTitle(),slide.getStyle()));   
        drawBody(slide);
        drawFooter(footer,page);
        return drawAll.toString();
    }
    
    private String drawTitle(Title title,Style s){
        StringBuilder t = new StringBuilder();
        
        t.append(s.getBackgroundColor());
        t.append(s.getTextColor());
        t.append(title.print());
        t.append(s.getBackgroundColor());
        t.append(s.getTextColor());
        
        return t.toString();
    }
    
    private String drawBody(Slide slide){
        
        return "";
    }
    
    private String drawFooter(Footer footer,int page){
        
        return "";
    }
    
    private String getTextColor(String name){
        
        return "";
    }
    
    private String getBackColor(String name){
        
        return "";
    }
}
