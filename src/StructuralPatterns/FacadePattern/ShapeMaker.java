package StructuralPatterns.FacadePattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ShapeMaker {
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public ShapeMaker(){
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void draw(){
        this.circle.draw();
        this.square.draw();
        this.rectangle.draw();
    }
}
