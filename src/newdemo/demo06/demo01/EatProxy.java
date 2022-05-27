package newdemo.demo06.demo01;

public class EatProxy implements IEat{
    private IEat eat ;
    public EatProxy(IEat eat) {
        this.eat = eat ;
    }
    @Override
    public void eat() {
        this.prepare();
        this.eat.eat();
        this.clear();
    }
    public void prepare() {
        System.out.println("[代理主题1]：准备食材");
        System.out.println("[代理主题2]：做饭");
    }
    public void clear() {
        System.out.println("[代理主题3]：清洗");
    }
}
