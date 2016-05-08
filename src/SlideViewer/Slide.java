package SlideViewer;

public class Slide implements Printable {
    private int contEle = 0;
    private Title title;   
    private Style style;
    //Começa com apenas 1 elememento/tópico
    private Element[] elem = new Element[1];

    
    public Element[] getElem() {
        return elem;
    }
    
    public Element getElem(int idx){
        return elem[idx];
    }
    
    public void addElement(String texto){
        try{
            //Add um elemento no espaço
            elem[contEle] = new Element(texto);
            contEle++;
        }
        //Caso seja necessário adicionar mais um elemento
        catch(ArrayIndexOutOfBoundsException e){
           //Copia os elementos atuais para swap. 
           Element[] swap = new Element[elem.length];
           swap = elem;
           //Criar um array com mais 1 espaço vazio;
           elem = new Element[++contEle];
           //Copia os elementos de swap para o novo array
           System.arraycopy(swap, 0, elem, 0, swap.length);
           //Adiciona o elemento desejado no novo espaço.
           elem[contEle - 1] = new Element(texto);
        }
        catch(Exception e){
            System.out.println("Erro ao adicionar o elemento");
        }

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
