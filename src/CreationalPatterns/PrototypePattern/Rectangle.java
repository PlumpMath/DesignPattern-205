package CreationalPatterns.PrototypePattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw(){
        System.out.println("Inside Rectangel::draw method.");
    }
}
