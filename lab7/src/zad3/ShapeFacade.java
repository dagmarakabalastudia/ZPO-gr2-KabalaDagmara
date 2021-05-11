package zad3;

public class ShapeFacade {
    private Shape rectangle;
    private Shape line;

    public ShapeFacade() {
        rectangle = new Rectangle();
        line = new Line();
    }

    public void drawRectangle(int x1, int y1 , int width, int height){
        rectangle.draw(x1,y1,width,height);
    }
    public void drawLine(int x1, int y1, int x2, int y2){
        line.draw(x1, y1, x2, y2);
    }
}
