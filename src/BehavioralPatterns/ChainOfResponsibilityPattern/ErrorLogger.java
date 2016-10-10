package BehavioralPatterns.ChainOfResponsibilityPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger:" + message);
    }
}
