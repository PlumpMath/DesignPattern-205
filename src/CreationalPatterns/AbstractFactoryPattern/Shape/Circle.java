package CreationalPatterns.AbstractFactoryPattern.Shape;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Insid Circle::draw() method.");
    }
}
