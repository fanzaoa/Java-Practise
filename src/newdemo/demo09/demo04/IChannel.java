package newdemo.demo09.demo04;

public interface IChannel {
    public abstract void send() ;
    public abstract class AbstractMessage {
        public abstract String getContent() ;
    }
}
