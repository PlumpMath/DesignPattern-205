package J2EEPatterns.BusinessDelegatePattern;

/**
 * Created by Administrator on 2016/10/14.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS service");
    }
}
