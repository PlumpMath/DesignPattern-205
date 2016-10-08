package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
