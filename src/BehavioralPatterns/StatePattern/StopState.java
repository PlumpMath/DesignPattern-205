package BehavioralPatterns.StatePattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stop");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
