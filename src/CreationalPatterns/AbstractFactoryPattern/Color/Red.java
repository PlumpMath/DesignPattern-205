package CreationalPatterns.AbstractFactoryPattern.Color;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("Inside Red::fill method.");
    }
}
