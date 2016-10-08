package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.Color.Color;
import CreationalPatterns.AbstractFactoryPattern.Shape.Circle;
import CreationalPatterns.AbstractFactoryPattern.Shape.Rectangle;
import CreationalPatterns.AbstractFactoryPattern.Shape.Shape;
import CreationalPatterns.AbstractFactoryPattern.Shape.Square;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        Shape result = null;

        if(shapeType == null){
            return result;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            result = new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            result = new Square();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            result = new Rectangle();
        }

        return result;
    }

    @Override
    public Color getColor(String colorType){
        return null;
    }
}
