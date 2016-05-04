package SlideViewer;

public class Slide implements Printable {
    private int contEle = 0;
    private Title title;   
    private Style style;
    private Element[] elem = new Element[contEle];

    
    public Slide(String title,Style s,int numElement){
        this.title = new Title(title);
        this.style = s;
        this.contEle = numElement;
    }

    public Element[] getElem() {
        return elem;
    }
    
    public Element getElem(int idx){
        return elem[idx];
    }
    
    public void addElement(String elem){
       this.elem = new Element[contEle];
       contEle++;
    }
    
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
   
   public String print(){
       char[][] matriz = new char[20][80];
       //Imprima slides dentro de bordas (80 colunas)
       //O slides tem no mínimo 20 linhas
       for(int linha=0; linha < matriz.length; linha++){
            for(int coluna=0; coluna < matriz[0].length; coluna++){
                if(linha == 0 || linha == 19)
                    System.out.print("_ ");
                if(linha == 1 && coluna == 0 || linha == 79 && coluna == 0)
                    System.out.println("|");
            }
       } return print();// Não entendi essa parte; 
   }
   
}
