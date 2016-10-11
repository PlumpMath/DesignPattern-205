package BehavioralPatterns.MediatorPattern;

/**
 * Created by Administrator on 2016/10/11.
 */
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
