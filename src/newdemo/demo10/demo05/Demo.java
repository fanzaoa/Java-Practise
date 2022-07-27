package newdemo.demo10.demo05;

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Nv() ;
        fu.a();
        if (fu instanceof Nv) {
            Nv nv = (Nv) fu;
            nv.b();
        }
    }
}
