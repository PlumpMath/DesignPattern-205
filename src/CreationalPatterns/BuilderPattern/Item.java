package CreationalPatterns.BuilderPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
