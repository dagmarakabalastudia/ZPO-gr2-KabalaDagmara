package zadanie3;

public abstract class CarSpeed
{
    Car car;
    int maxSpeed;
    String carName;
    public void setCarSpeed (Car c)
    {
        car = c;
    }
    public void setMaxSpeed (int ms) {
        maxSpeed = ms;
    }
    public void setCarName (String cn) {
        carName = cn;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void showCarName()
    {
        System.out.println(carName);
    }
}

