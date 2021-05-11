package zad3;

public class Line implements Shape {

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Rysuję linię z punktu (" + x1 + "," + y1 + ") do ("+ x2 + "," + y2 + ")");
    }
}