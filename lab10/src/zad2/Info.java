package zad2;

public class Info implements Observer{
    String info;

    public Info(String info){
        this.info = info;
    }

    @Override
    public void newsletter() {
        System.out.println(this.info);
    }

}
