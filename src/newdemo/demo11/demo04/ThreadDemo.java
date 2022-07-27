package newdemo.demo11.demo04;

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread() ;
        new Thread(mt,"线程A").start(); ; // 设置了线程名字，子线程
//        new Thread(mt).start(); ; // 未设置线程名字，系统会自动生成不重复的名字
//        new Thread(mt,"线程B").start(); ; // 设置了线程名字
        mt.run() ; // 对象直接调用run()方法，主线程
    }
}
