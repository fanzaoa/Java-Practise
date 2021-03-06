package 对象数组;
//一般用ArrayList.练习.T_2中的ArrayList集合，因为ArrayList集合长度可变，数组一旦定义长度不可变。

/*
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class ArrayDemo {

    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("m",15);
        Person two =new Person("t",18);
        Person three = new Person("f",21);

        //将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(one.getName());
        System.out.println(array[0].getAge());
    }
}
