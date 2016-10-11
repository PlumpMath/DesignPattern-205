package BehavioralPatterns.MementoPattern;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
