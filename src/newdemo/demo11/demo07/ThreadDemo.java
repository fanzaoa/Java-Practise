package newdemo.demo11.demo07;

// 线程强制运行
// 线程礼让

public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        Thread mainThread = Thread.currentThread() ; // 获得主线程
        Thread thread = new Thread(() -> {
            for (int x = 0; x < 100; x++) {
//                if (x == 3) { // 现在主线程来了
//                    try {
//                        mainThread.join(); // 主线程要先执行
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
                if (x % 3 == 0) {
                    Thread.yield(); // 线程礼让
                    System.out.println("让main线程先执行");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "执行、x = " + x);
            }
        },"子线程") ;
        thread.start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            System.out.println("【mian线程】number = " + i);
        }
    }
}
