package test.static1.demo_成员方法;

public class MyClass {

    private int a;
    static int b;

    public void method(){
        System.out.println("成员方法");
        System.out.println(a);
        System.out.println(b);
    }

    public static void methodStatic(){
        System.out.println("静态方法");
//        System.out.println(a);// 错误
        System.out.println(b);
    }
}
