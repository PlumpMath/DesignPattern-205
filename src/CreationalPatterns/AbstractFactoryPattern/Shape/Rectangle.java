package CreationalPatterns.AbstractFactoryPattern.Shape;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
