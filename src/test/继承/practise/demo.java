package test.继承.practise;

public class demo {

    public static void main(String[] args) {
        /*
        父类构造方法执行
        子类构造方法执行
         */
        Zi zi = new Zi();
        zi.method();// 优先执行本类方法
    }
}
