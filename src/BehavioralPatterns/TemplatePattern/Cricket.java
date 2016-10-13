package BehavioralPatterns.TemplatePattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket init");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket end");
    }
}
