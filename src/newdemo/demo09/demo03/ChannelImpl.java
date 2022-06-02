package newdemo.demo09.demo03;

public class ChannelImpl implements IChannel {

    @Override
    public void send(IMessage msg) {
        System.out.println("发送消息：" + msg.getContent());
    }
    public class MessageImpl implements IMessage {

        @Override
        public String getContent() {
            return "mtf.wiki" ;
        }
    }
}
