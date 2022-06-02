package newdemo.demo06.demo04;

public class Singleton {
    /* 饿汉式
//    private static final Singleton singleton = new Singleton() ;
//
//    public static Singleton getSingleton() {
//        return singleton ;
//    }
    */
    // 懒汉式
    private static Singleton singleton ;
    public static Singleton getSingleton() {
        if(singleton == null){ // 第一次使用
            return new Singleton() ; // 实例化对象
        }
        return singleton ;
    }

    private Singleton() { }

    public void print() {
        System.out.println("lll");
    }
}
