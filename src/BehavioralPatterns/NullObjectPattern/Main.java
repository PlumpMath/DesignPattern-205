package BehavioralPatterns.NullObjectPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Main {
    public static void main(String[] args) {
        AbstractCustomer rob = CustomerFactory.getCustomer("Rob");
        System.out.println(rob.getName());
        AbstractCustomer customer = CustomerFactory.getCustomer("1111");
        System.out.println(customer.getName());
    }
}
