package test.多态.trans;

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();// 本来是一只猫
        animal.eat();// 猫吃鱼
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}
