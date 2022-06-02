package newdemo.demo09.demo02;

public class Main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner() ;
        in.print();
    }
}
