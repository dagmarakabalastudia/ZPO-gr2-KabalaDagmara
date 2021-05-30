package zad3;

public class Main {
    public static void main(String[] args) {
        String[] months = {
                "Styczen",
                "Luty",
                "Marzec",
                "Kwiecien",
                "Maj",
                "Czerwiec",
                "Lipiec",
                "Sierpien",
                "Wrzesien",
                "Pazdziernik",
                "Listopad",
                "Grudzien"};

        for (String month : months) {
            FinancialData valueMonth = FinancialData.getInstance(month);
            System.out.println(month + ": " + valueMonth.getValue());
        }
    }
}