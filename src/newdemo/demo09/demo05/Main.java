package newdemo.demo09.demo05;

public class Main {
    public static void main(String[] args) {
        IChannel iChannel = IChannel.getInstance() ;
        iChannel.send();
    }
}
