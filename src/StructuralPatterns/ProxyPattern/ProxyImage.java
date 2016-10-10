package StructuralPatterns.ProxyPattern;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ProxyImage implements Image {
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("befor");
        RealImage realImage = new RealImage(fileName);
        realImage.display();
        System.out.println("after");
    }
}
