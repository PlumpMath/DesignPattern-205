package J2EEPatterns.BusinessDelegatePattern;

/**
 * Created by Administrator on 2016/10/14.
 */
public class BusinessDelegate {
    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
