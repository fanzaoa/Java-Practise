package test.多态.trans;

public class Main {

    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();// 猫吃鱼

        //向下转型，进行“还原”动作
        Cat cat = (Cat) animal;
        cat.catchMouse();// 猫抓老鼠

        //下面是错误的向下转型
        //本来new的时候是一只猫，不能当做狗
        //错误写法！编译不会报错，但是运行会出现异常
        //java.lang.ClassCastException,类转换异常
        Dog dog = (Dog) animal;
    }
}
