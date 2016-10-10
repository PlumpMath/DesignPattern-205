package StructuralPatterns.ProxyPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("disply:" + fileName);
    }
}
