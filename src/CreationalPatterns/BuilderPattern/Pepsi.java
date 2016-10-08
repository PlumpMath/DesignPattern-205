package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 11.3f;
    }
}
