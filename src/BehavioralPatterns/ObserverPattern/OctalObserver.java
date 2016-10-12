package BehavioralPatterns.ObserverPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("This is Octal  state:" + subject.getState());
    }
}
