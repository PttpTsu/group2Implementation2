package group2.group2remake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Item {
    public String name;
    private Rectangle rect;
    private double xCord;
    private double yCord;
    private double height;
    private double width;
    private double price;

    public Item(String itemName,double xCord,double yCord, double height, double width, double price){
        this.name = itemName;
        this.xCord = xCord;
        this.yCord = yCord;
        this.height = height;
        this.width = width; 
        this.price=price; 
        Rectangle rec = new Rectangle();
        rec.setWidth(this.width);
        rec.setHeight(this.height);
        rec.setStroke(Color.RED);
    }
    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getxCord() {
        return xCord;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getyCord() {
        return yCord;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
