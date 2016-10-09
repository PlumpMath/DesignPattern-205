package StructuralPatterns.AdapterPattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing vlc file, Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName){

    }
}
