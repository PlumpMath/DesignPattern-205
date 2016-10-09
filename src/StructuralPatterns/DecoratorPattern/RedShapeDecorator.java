package StructuralPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape s) {
        super(s);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border Color:Red");
    }
}

