package zad1;

public abstract class Duck {
    Fly fly;
    Quack quack;
    String name;
    public Duck(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void printName(){
        System.out.println("Jestem  " + this.name);
    }
    public void setFly (Fly f) {
        fly = f;
    }
    public void setQuack (Quack q) {
        quack = q;
    }
    public void performFly() {
        fly.fly();
    }
    public void performQuack() {
        quack.quack();
    }
}
