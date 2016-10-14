package J2EEPatterns.BusinessDelegatePattern;

/**
 * Created by Administrator on 2016/10/14.
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
