package zadanie4;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFly(new FlyRocket());
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck duck1 = new DuckOrdinary();
        Duck duck2 = new DuckOrdinary();
        Duck duck3 = new DuckOrdinary();
        Duck duck4 = new DuckOrdinary();
    }
}
