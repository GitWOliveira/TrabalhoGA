package SlideViewer;

public class Style {

    private String textColor;
    private String backgroundColor;
    private String titleTextColor;
    private String titleBackColor;

    public Style(String line) {
        line = line.substring(6);
        String[] cores = line.split(";");
        this.textColor = conversion(cores[1]);
        this.backgroundColor = conversion(cores[2]);
        this.titleTextColor = conversion(cores[3]);
        this.titleBackColor = conversion(cores[4]);
    }
    
    private String conversion(String cor) {
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
    
    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTitleTextColor() {
        return titleTextColor;
    }

    public void setTitleTextColor(String titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    public String getTitleBackColor() {
        return titleBackColor;
    }

    public void setTitleBackColor(String titleBackColor) {
        this.titleBackColor = titleBackColor;
    }
}
