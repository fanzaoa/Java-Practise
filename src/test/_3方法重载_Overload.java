package test;

/*
方法的重载（Overload):多个方法的名称一样，但是参数列表不一样

方法重载与下列因素有关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class _3方法重载_Overload {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.2,20));
    }

    public static double sum(int a, int b) {
        System.out.println("调用两个参数的");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("调用三个参数的");
        return a + b + c;
    }

    public static int sum(double a, int b) {
        return (int) a + b;
    }
}
