package StructuralPatterns.BridgePattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
