package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.Color.Color;
import CreationalPatterns.AbstractFactoryPattern.Shape.Shape;

/**
 * Created by Administrator on 2016/10/8.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}
