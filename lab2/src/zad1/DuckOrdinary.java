package zad1;

public class DuckOrdinary extends Duck {

    public DuckOrdinary(String name) {
        super(name);
        fly = new FlyOrdinary();
        quack = new QuackOrdinary();
        }
    }

