package BehavioralPatterns.ObserverPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("This is Binary  state:" + subject.getState());
    }
}
