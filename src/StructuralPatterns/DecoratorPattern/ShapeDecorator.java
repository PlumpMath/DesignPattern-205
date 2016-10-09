package StructuralPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public abstract class ShapeDecorator {
    private Shape shape;
    public ShapeDecorator(Shape s){
        this.shape = s;
    }

    public void draw(){
        this.shape.draw();
    }
}
