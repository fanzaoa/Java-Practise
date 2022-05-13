package test.多态.trans;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watchHouse(){
        System.out.println("看家");
    }
}
