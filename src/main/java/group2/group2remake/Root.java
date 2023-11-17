package group2.group2remake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Root {
    private String rootName = "root";
    private double x = 0;
    private double y = 0;
    private double price ;
    

    private Rectangle rect = new Rectangle();

    public Root(){
        rect.setLayoutX(354);
        rect.setLayoutX(354);
        rect.setWidth(400);
        rect.setHeight(400);
        rect.setStroke(Color.BLACK);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return rootName;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
