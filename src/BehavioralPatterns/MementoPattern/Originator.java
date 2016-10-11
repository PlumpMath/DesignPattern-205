package BehavioralPatterns.MementoPattern;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Originator {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
