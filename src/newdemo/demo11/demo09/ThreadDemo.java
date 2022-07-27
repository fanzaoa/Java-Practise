package newdemo.demo11.demo09;

// 线程同步处理
// 同步会造成性能下降

class MyThread implements Runnable {

    private int ticket = 10 ;

    public synchronized boolean sale () { // synchronized关键字每次只允许一个线程进行访问（同步方法）
        if (ticket > 0) {
            try {
                Thread.sleep(100); // 模拟网络延迟
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "买票" + ",ticket = " + ticket--);
            return true ;
        } else {
            System.out.println("票买光了");
            return false ;
        }
    }
    @Override
    public void run() {
        while (this.sale()) {
            ;
        }
    }

    //    @Override
//    public void run() {
//        while (true) {
//            synchronized (this) { // 同步代码块
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100); // 模拟网络延迟
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println(Thread.currentThread().getName() + "买票" + ",ticket = " + ticket--);
//                } else {
//                    System.out.println("票买光了");
//                    break;
//                }
//            }
//        }
//    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread() ;
        new Thread(mt,"线程A").start() ;
        new Thread(mt,"线程B").start() ;
        new Thread(mt,"线程C").start() ;
    }
}
