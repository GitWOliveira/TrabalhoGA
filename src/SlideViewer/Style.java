package SlideViewer;

public class Style {

    private String textColor;
    private String backgroundColor;
    private String titleTextColor;
    private String titleBackColor;

    public Style(String line) {
        line = line.substring(6);
        String[] cores = line.split(";");
        this.textColor = cores[0];
        this.backgroundColor = cores[1];
        this.titleTextColor = cores[2];
        this.titleBackColor = cores[3];
    }

    public String conversion(String cor) {
        if (cor.equalsIgnoreCase("black")) {
            return "\u001B[30m";
        } else if (cor.equalsIgnoreCase("blue")) {
            return "\u001B[34m";
        } else if (cor.equalsIgnoreCase("yellow")) {
            return "\u001B[33m";
        } else if (cor.equalsIgnoreCase("white")) {
            return "\u001B[37m";
        } else if (cor.equalsIgnoreCase("dark_blue")) {
            return "\u001B[1;34m";
        } else if (cor.equalsIgnoreCase("dark_grey")) {
            return "\u001B[1;47m";
        } else {
            return "Cor Invalida ";
        }
    }
}
