package newdemo.demo09.demo07;

public interface IMessageWarp { // 消息包装
    static interface IMessage {
        public String getContent() ;
    }
    static interface IChannel {
        public boolean connect() ; // 消息的发送通道
    }
    public static void send(IMessage iMessage,IChannel iChannel) {
        if(iChannel.connect()){
            System.out.println(iMessage.getContent());
        }else {
            System.out.println("发送失败");
        }
    }
}
