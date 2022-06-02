package newdemo.demo09.demo03;

public class Main {
    public static void main(String[] args) {
        IChannel iChannel = new ChannelImpl() ;
        iChannel.send(((ChannelImpl)iChannel).new MessageImpl());
    }
}
