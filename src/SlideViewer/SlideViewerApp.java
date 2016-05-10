package SlideViewer;

import javax.swing.JOptionPane;

public class SlideViewerApp {
    public static void main(String[] args){
        try {
          PresentationLoader pl = new PresentationLoader();
          Presentation pp = pl.loader("presentation.txt");    
          SlideDesigner sd = new SlideDesigner();
          Navigator nav = new Navigator(pp.getSlides());
            
            
            int op = 0;
            do {
                try{                   
                    op = ReadData.readInt("1-Anterior, 2-Proximo, 3-Especifico, 0-Sair"); 
                    switch (op) {
                        case 1:
                                nav.previous();
                            break;
                        case 2:
                                nav.next();
                            break;
                        case 3:
                            int num = ReadData.readInt("Numero do slide: ");                            
                                nav.Goto(num);
                        case 0:
                            break;                        
                    }                    
                }catch (NumberFormatException ex) {
                    op = 0;
                }catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    op = -1;
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }while (op != 0);
            
            } catch (Exception ex) {
                System.out.println(ex);
        }
        
    } 
}
