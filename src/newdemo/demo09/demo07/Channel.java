package newdemo.demo09.demo07;

public class Channel implements IMessageWarp.IChannel{
    @Override
    public boolean connect() {
        return true;
    }
}
