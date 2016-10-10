package BehavioralPatterns.CommandPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Stock {
    private String name = "ABC";
    private int qty = 10;

    public void buy() {
        System.out.println("Buy name:" + name + ",qty:" + qty);
    }

    public void sell() {
        System.out.println("Sell name:" + name + ",qty:" + qty);
    }
}
