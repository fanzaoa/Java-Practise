package newdemo.demo09.demo02;

public class Outer {
    private String msg = "mtf.wiki" ;
    class Inner {
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
}
