package J2EEPatterns.BusinessDelegatePattern;

/**
 * Created by Administrator on 2016/10/14.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
