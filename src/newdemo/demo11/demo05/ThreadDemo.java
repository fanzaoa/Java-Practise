package newdemo.demo11.demo05;

// 线程休眠

public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "、i = " + i);
                try {
                    Thread.sleep(1000); // 单位ms，暂缓执行
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
//                    e.printStackTrace();
                }
            }
        },"线程对象").start();
    }
}
