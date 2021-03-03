package zadanie4;

public abstract class Duck {
    Fly fly;
    Quack quack;
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
