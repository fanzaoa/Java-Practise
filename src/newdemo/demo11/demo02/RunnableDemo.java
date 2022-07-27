package newdemo.demo11.demo02;

class MyThread implements Runnable {
    private String title ;
    public MyThread(String title) {
        this.title = title ;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，i = " + i);
        }
    }
}
public class RunnableDemo {
//    public Thread(Runnable target) { // Thread类中关于Runnable类的构造方法
//        init(null, target, "Thread-" + nextThreadNum(), 0);
//    }
    public static void main(String[] args) {
        new Thread(new MyThread("线程A")).start();
        new Thread(new MyThread("线程B")).start();
        new Thread(new MyThread("线程C")).start();
    }
}
