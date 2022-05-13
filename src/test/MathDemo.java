package test;

public class MathDemo {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.2));// 3.2
        System.out.println(Math.abs(-4.1));// 4.1
        System.out.println(Math.abs(0));// 0
        System.out.println("===============");

        //向上取整
        System.out.println(Math.ceil(4.1));// 5.0
        System.out.println(Math.ceil(3.9));// 4.0
        System.out.println(Math.ceil(-4.1));// -4.0
        System.out.println(Math.ceil(4.0));// 4.0
        System.out.println("=================");

        //向下取整
        System.out.println(Math.floor(3.9));// 3.0
        System.out.println(Math.floor(-4.1));// -5.0
        System.out.println(Math.floor(4));// 4.0
        System.out.println("================");

        //四舍五入
        System.out.println(Math.round(3.4));// 3
        System.out.println(Math.round(3.6));// 4
        System.out.println(Math.round(-3.2));// -3
    }
}
