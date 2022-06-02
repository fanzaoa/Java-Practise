package newdemo.demo08.demo02;

public class Main {
    public static void main(String[] args) {
        try { // 异常对象不再是由系统生成的，而是由手工定义的
            throw new Exception("自己抛着玩的对象") ; // throw关键字
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
