package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class VegBurger extends Burger {
    @Override
    public float price(){
        return 25.1f;
    }
    @Override
    public String name(){
        return "Veg Burger";
    }
}
