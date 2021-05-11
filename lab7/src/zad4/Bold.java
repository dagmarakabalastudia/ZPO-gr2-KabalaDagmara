package zad4;

public class Bold implements FontStyle{
    @Override
    public void useFontStyle(String text) {
        System.out.println(" Pogrubiony -> \033[1m " + text );
    }
}
