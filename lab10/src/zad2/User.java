package zad2;
import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    boolean wantInfo;
    List<Observer> info = new ArrayList<>();;

    public User(String name, boolean wantInfo){
        this.name = name;
        this.wantInfo = wantInfo;
    }

    public void addInfo(Observer observers){
        this.info.add(observers);
        System.out.println(this.name + " twoja lista komunikatów");
        for (Observer i : info){
            i.newsletter();
        }
        System.out.println();
    }
}
