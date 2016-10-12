package BehavioralPatterns.NullObjectPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "not name";
    }
}
