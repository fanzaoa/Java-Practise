package newdemo.demo11.demo01;

class MyThread extends Thread { // 线程的主题类
    private String title ;
    public MyThread(String title) {
        this.title = title ;
    }

    @Override
    public void run() { // 线程的主体方法
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，i = " + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("线程A");
        mt.start();
//        mt.start(); // 重复进行线程启动会抛出IllegalThreadStateException异常
        new MyThread("线程B").start();
    }
}
