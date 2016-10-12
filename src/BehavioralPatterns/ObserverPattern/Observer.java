package BehavioralPatterns.ObserverPattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
