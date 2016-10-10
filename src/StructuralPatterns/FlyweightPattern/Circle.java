package StructuralPatterns.FlyweightPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Circle implements Shape {
    public Circle(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private  String color;
    private int x;
    private int y;

    @Override
    public void draw() {
        System.out.println("Color:" + this.color + ",x:" + this.x + ",y:" + this.y);
    }
}
