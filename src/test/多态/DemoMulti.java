package test.多态;

/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class DemoMulti {

    public static void main(String[] args) {

        /*使用多态的写法
        左侧父类的引用，指向了右侧子类的对象*/
        Fu obj = new Zi();

        obj.method();// 子类方法，看new的谁
        obj.methodFu();
        System.out.println("==========");

        /*
        访问成员变量的两种方式：

        1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
        2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
         */
        System.out.println(obj.num);// 10
    }
}
