package newdemo.demo06.demo02;

public class Main {
    public static void main(String[] args) {
        IFood food = Factory.getInstance("milk") ;
        food.eat();
    }
}
