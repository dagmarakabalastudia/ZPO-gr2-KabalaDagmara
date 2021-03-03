package zadanie4;

public class DuckOrdinary extends Duck {

    public DuckOrdinary() {
            fly = new FlyOrdinary();
            quack = new QuackOrdinary();
        }
    }

