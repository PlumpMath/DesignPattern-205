package BehavioralPatterns.StrategyPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int excuteStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
