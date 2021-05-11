package zad1;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setCommand(new CommandHistory());
        user.addCommandHistory("skok", "big", "skok", "unik");

    }
}
