package zad1;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        fly = new FlyRocket();
        quack = new QuackOrdinary();
    }
}