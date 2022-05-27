package newdemo.demo06.demo01;

public class Main {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new EatReal()) ;
        eat.eat();
    }
}
