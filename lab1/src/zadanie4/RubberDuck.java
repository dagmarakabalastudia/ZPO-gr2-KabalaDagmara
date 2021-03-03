package zadanie4;

public class RubberDuck extends Duck {

    public RubberDuck() {
        fly = new FlyRocket();
        quack = new QuackOrdinary();
    }
}