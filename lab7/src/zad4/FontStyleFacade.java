package zad4;

public class FontStyleFacade {
    private FontStyle bold;
    private FontStyle italic;

    public FontStyleFacade() {
        bold = new Bold();
        italic = new Italic();
    }

    public void useBold(String text){
        bold.useFontStyle(text);
    }
    public void useItalic(String text){
        italic.useFontStyle(text);
    }
}
