package CreationalPatterns.AbstractFactoryPattern.Shape;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
