package arraylist.practise;

import java.util.ArrayList;

/*
题目：
自定义3个学生对象，添加到集合，并遍历。
 */
public class T_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("m",13);
        Student two = new Student("t",19);
        Student three = new Student("f",21);

        //添加到集合
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(list);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name:"+stu.getName()+",age:"+stu.getAge());
        }
    }
}
