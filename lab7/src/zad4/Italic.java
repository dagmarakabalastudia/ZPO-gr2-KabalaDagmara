package zad4;

public class Italic implements FontStyle{
    @Override
    public void useFontStyle(String text) {
        System.out.println("pochylony \033[3m" + text);
    }
}
