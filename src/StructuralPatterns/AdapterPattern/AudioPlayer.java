package StructuralPatterns.AdapterPattern;

/**
 * Created by Administrator on 2016/10/9.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file ,name: " + fileName);
        }else if(audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("Mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media.  " + audioType + " format not supported");
        }
    }
}
