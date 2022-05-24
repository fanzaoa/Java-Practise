package newdemo.demo05;

public class Person extends Action{
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");
    }

    @Override
    public void work() {
        System.out.println("人工作");
    }
}
