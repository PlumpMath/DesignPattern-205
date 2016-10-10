package StructuralPatterns.FlyweightPattern;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMape = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMape.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMape.put(color, circle);
            System.out.println("put circle color:" + color);
        }
        return circle;
    }
}
