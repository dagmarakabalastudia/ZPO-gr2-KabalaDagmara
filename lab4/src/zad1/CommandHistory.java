package zad1;

import java.util.ArrayList;

public class CommandHistory implements Command{
    ArrayList<String> historyCommand = new ArrayList<>();

    @Override
    public ArrayList<String> execute(String... com) {
        for(String x: com){
            historyCommand.add(x);
        }
        return historyCommand;
    }
}
