package BehavioralPatterns.VisitorPattern;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
