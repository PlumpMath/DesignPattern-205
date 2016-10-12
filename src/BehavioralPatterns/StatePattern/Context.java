package BehavioralPatterns.StatePattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
