package BehavioralPatterns.StrategyPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
