package newdemo.demo11.demo06;

// 线程中断

public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(()->{
            System.out.println("开始");
            try {
                Thread.sleep(10000); // 预计休眠10s
                System.out.println("结束");
            } catch (InterruptedException e) {
                System.out.println("被打断");
            }
        }) ;
        thread.start(); // 开始
        Thread.sleep(1000);
        if(!thread.isInterrupted()) { // 判断该线程是否中断
            System.out.println("打断执行");
            thread.interrupt();
        }
    }
}
