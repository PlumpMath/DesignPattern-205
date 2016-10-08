package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 12.4f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
