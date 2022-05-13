package test.继承.practise;

public class Zi extends Fu{

    int a = 20;

    public Zi(){
        super();//不写会自动加上
        System.out.println("子类构造方法执行");
    }

    public void method(){
        int c = 30;
//        super.method();
        System.out.println("子类方法执行！");
        System.out.println("===========");

        System.out.println(c);// 局部变量
        System.out.println(this.a);// 本类的成员变量
        System.out.println(super.a);// 父类的成员变量
    }
}
