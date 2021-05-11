package zad3;

public class Rectangle implements Shape {

    @Override
    public void draw(int x1, int y1, int width, int height) {
        System.out.println("Rysuję prostokąt z punktu (" + x1 + "," + y1 + ") o długości " + width + " i wysokości "+ height);
    }
}
