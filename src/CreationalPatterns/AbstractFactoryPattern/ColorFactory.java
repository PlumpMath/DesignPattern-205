package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.Color.Blue;
import CreationalPatterns.AbstractFactoryPattern.Color.Color;
import CreationalPatterns.AbstractFactoryPattern.Color.Green;
import CreationalPatterns.AbstractFactoryPattern.Color.Red;
import CreationalPatterns.AbstractFactoryPattern.Shape.Shape;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType){
        Color color = null;
        if(colorType == null){
            return color;
        }

        if(colorType.equalsIgnoreCase("RED")){
            color = new Red();
        }else if(colorType.equalsIgnoreCase("GREEN")){
            color = new Green();
        }else if(colorType.equalsIgnoreCase("BLUE")){
            color = new Blue();
        }
        return color;
    }

    @Override
    public Shape getShape(String shapeType){
        return null;
    }
}
