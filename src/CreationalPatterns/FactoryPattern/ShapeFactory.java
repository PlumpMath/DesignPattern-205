package CreationalPatterns.FactoryPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ShapeFactory {
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
}
