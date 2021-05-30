package zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User("Pierwszy", true);
        User user2 = new User("Drugi", false);
        User user3 = new User("Trzeci", false);
        User user4 = new User("Czwarty", true);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        Info info1 = new Info("Komunikat pierwszy");
        Info info2 = new Info("Komunikat drugi");
        Info info3 = new Info("Komunikat trzeci");
        for (User user : users){
            if(user.wantInfo) {
                user.addInfo(info1);
            }
            else {
                System.out.println(user.name + " nie wyraził zgody na otrzymywanie komunikatów \n");
            }
        }
        for (User user : users){
            if(user.wantInfo) {
                user.addInfo(info2);
            }
            else {
                System.out.println(user.name + " nie wyraził zgody na otrzymywanie komunikatów \n");
            }
        }
        for (User user : users){
            if(user.wantInfo) {
                user.addInfo(info3);
            }
            else {
                System.out.println(user.name + " nie wyraził zgody na otrzymywanie komunikatów \n");
            }
        }
    }
}
