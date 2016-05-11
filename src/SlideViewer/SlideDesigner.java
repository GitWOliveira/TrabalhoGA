package SlideViewer;

public class SlideDesigner {
    
    public String drawSlide(Slide slide,int page,Footer footer){
        StringBuilder drawAll = new StringBuilder();
        
        String bordaSup = "---------------------------------------------------------------------------------\n";
        String bordaLat = "|                                                                                |\n";
        drawAll.append(getBackColor(""));
        drawAll.append(bordaSup);
        
        for(int i=0; i<19; i++){
            drawAll.append(getBackColor(""));
            drawAll.append(bordaLat);
            drawAll.append(drawTitle(slide.getTitle(),slide.getStyle()));       
            drawBody(slide);
            drawFooter(footer,page);
        } 
        
        drawAll.append(getBackColor(bordaLat));
        drawAll.append(bordaSup);  
        
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
