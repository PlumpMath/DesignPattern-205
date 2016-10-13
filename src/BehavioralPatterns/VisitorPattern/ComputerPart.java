package BehavioralPatterns.VisitorPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
