package BehavioralPatterns.TemplatePattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
