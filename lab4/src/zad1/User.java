package zad1;

import java.util.ArrayList;

public class User {
    Command command;
    ArrayList<String> historyCommand = new ArrayList<>();

    public void setCommand(Command command){
        this.command = command;
    }

    public void addCommandHistory(String... com){
        this.historyCommand = command.execute(com);
        System.out.println(historyCommand);
    }
}
