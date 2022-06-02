package newdemo.demo09.demo04;

public class Main {
    public static void main(String[] args) {
        IChannel iChannel = new ChannelImpl() ;
        iChannel.send();
    }
}
