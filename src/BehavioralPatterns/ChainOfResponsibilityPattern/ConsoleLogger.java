package BehavioralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger:" + message);
    }
}
