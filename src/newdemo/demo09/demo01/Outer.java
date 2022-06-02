package newdemo.demo09.demo01;

// 外部类和内部类可以不需要通过get、set间接访问私有成员属性
public class Outer { // 外部类
    private String msg = "mtf.wiki" ; // 私有成员属性
    public void fun() { // 普通方法
        Inner in = new Inner(this) ;
        in.print(); // 调用内部类方法
        System.out.println(in.info); // 访问内部类的私有属性
    }
    public String getMsg() {
        return this.msg ;
    }
    class Inner { // 在Outer类的内部定义了Inner类
        private String info = "今天天气不好" ;
        private Outer outer ;
        public Inner(Outer outer) {
            this.outer = outer ;
        }
        public void print() {
            System.out.println(Outer.this.msg); // Outer类中的私有属性
            System.out.println(this.outer.getMsg());
        }
    }
}
