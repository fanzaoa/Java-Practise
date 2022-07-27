package newdemo.demo11.demo08;

/*
线程优先级
最高优先级：public static final int MAX PRIORITY,10;

·中等优先级：public static final int NORM PRIORITY,5;

·最低优先级：public static final int MIN PRIORITY,1;
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Runnable run =  () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "运行" + i);
            }
        } ;
        Thread threadA = new Thread(run,"线程A") ;
        Thread threadB = new Thread(run,"线程B") ;
        Thread threadC = new Thread(run,"线程C") ;
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
