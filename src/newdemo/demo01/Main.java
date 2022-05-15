package newdemo.demo01;

/*
类关联结构
 */
public class Main {

    public static void main(String[] args) {

        // 第一步：声明对象并且设置彼此的关系
        Car car = new Car("宾利", 80000000);
        Person person = new Person("张三", 20);

        Person person1 = new Person("李四", 20);
        Person person2 = new Person("王五", 20);
        person1.setCar(new Car("a", 1000));// 匿名对象
        person2.setCar(new Car("b", 2000));
        person.setChildren(new Person[]{person1, person2});

        car.setPerson(person);// 一个车属于一个人
        person.setCar(car);// 一个人有一辆车

        System.out.println(person);// newdemo.demo01.Person@75b84c92
        System.out.println(person.getCar());// newdemo.demo01.Car@6bc7c054,getCar()将person的地址值变成了car的
        // 第二步：根据关系获得数据
        System.out.println(person.getCar().getInfo());// 汽车品牌型号：宾利、汽车价格：80000000
        System.out.println(car.getPerson().getInfo());// 姓名：张三、年龄20

        // 根据人找到所有的孩子以及孩子对应的汽车
        for (int x = 0; x < person.getChildren().length; x++) {
            System.out.println("\t|-" + person.getChildren()[x].getInfo());
            System.out.println("\t\t|-" + person.getChildren()[x].getCar().getInfo());
        }
    }
}
