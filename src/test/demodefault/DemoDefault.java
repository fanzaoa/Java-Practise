package test.demodefault;

public interface DemoDefault {

    public default void method(){
        System.out.println("默认方法");
    }
}
