package StructuralPatterns.AdapterPattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file, Name: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
