package newdemo.demo09.demo05;

public interface IChannel {
    public abstract void send() ;
    class ChannelImpl implements IChannel {
        @Override
        public void send() {
            System.out.println("mtf.wiki");
        }
    }
    public static IChannel getInstance() {
        return new ChannelImpl() ;
    }
}
