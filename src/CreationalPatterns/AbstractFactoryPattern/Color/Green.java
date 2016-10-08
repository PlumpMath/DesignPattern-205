package CreationalPatterns.AbstractFactoryPattern.Color;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Green implements Color {
    @Override
    public void fill(){
        System.out.println("Insid Green::fill method.");
    }
}
