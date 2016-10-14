package J2EEPatterns.BusinessDelegatePattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Process task by invoking EJB Service");
    }
}
