/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlideViewer;

import javax.swing.JOptionPane;

/**
 *
 * @author W.Oliveira
 */
public class SlideViewerApp {
    public static void main(String[] args){
        try {
          PresentationLoader pl = new PresentationLoader();
           Presentation pp = pl.loader("presentation.txt");            
           Navigator nav = new Navigator(pp.getSlide());
            
            
            int op = 0;
            do {
                try{
                    String temp = JOptionPane.showInputDialog("1-Anterior, 2-Proximo, 3-Especifico, 0-Sair");
                    op = Integer.valueOf(temp);
                    switch (op) {
                        case 1:
                            nav.previous();
                            break;
                        case 2:
                            nav.next();
                            break;
                        case 3:
                            String num = JOptionPane.showInputDialog("Numero do slide: ");
                            int n = Integer.valueOf(num);
                            nav.Goto(n);
                        case 0:
                            break;                        
                    }
                    
                }catch (NumberFormatException ex) {
                    op = 0;
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    op = -1;
                }
            }while (op != 0);
            
            } catch (Exception ex) {
                System.out.println(ex);
        }
    } 
}
