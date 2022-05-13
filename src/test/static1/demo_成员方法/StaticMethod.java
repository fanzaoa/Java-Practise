package test.static1.demo_成员方法;

/*
一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
静态变量：类名称.成员变量
静态方法：类名称.静态方法()

注意事项：
1.静态不能直接访问非静态。
原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
”先不知道后，后知道先“
2.静态方法当中不能用this。
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
静态方法是采用的类名称.静态方法()，没有对象。强行使用this.XX会被翻译成this(类).XX
 */
public class StaticMethod {

    public static void main(String[] args) {
        MyClass m = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        m.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用。
        MyClass.methodStatic();//推荐
        m.methodStatic();//不推荐，这种写法在编译之后也会被javac翻译成为”类名称.静态方法名“

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod(){
        System.out.println("本类自己的方法");
    }
}
