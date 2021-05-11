package zad1;

public class Main {
    public static void main(String[] args) {
        FileFacade file = new FileFacade(7);
        file.getValuesFromKeyboard();
        file.PrintArray();
        file.sortArray();
        file.PrintArray();
        file.getValuesFromFile();
        file.PrintArray();
        file.sortArray();
        file.PrintArray();
    }
}