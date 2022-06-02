package newdemo.demo09.demo06;

public class Outer {
    private static final String MSG = "mtf.wiki" ;
    static class Inner { // static内部类
        public void print() {
            System.out.println(Outer.MSG);
        }
    }
}
