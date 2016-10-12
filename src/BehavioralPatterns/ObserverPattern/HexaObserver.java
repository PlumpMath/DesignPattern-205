package BehavioralPatterns.ObserverPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("This is Hexa  state:" + subject.getState());
    }
}
