package practicaParcial.ej2ServidorWeb;

public class Parrafo extends Componente{
    private int fontSize;
    private String content;

    public Parrafo(int fontSize, String content) {
        this.fontSize = fontSize;
        this.content = content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public double getTamanio() {
        return getContent().length();
    }

    @Override
    public double getCant() {
        return 0;
    }
}