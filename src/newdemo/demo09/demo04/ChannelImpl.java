package newdemo.demo09.demo04;

public class ChannelImpl implements IChannel{
    @Override
    public void send() {
        AbstractMessage msg = new MessageImpl() ;
        System.out.println(msg.getContent());
    }
    class MessageImpl extends AbstractMessage {
        @Override
        public String getContent() {
            return "mtf.wiki";
        }
    }
}
