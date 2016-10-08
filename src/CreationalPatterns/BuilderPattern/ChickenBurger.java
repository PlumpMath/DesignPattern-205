package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price(){
        return 34.3f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
