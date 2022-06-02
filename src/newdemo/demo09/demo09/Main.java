package newdemo.demo09.demo09;


public class Main {
    public static void main(String[] args) {
        // 匿名内部类
        IMessage iMessage = new IMessage() {
            @Override
            public void send(String str) {
                System.out.println(str);
            }
        } ;
        iMessage.send("mtf.wiki");
    }
}
