package CreationalPatterns.PrototypePattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    public void draw(){
        System.out.println("Inside Square::draw method.");
    }
}
