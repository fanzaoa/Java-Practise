package arraylist.practise;

import java.util.ArrayList;

/*
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。
 */
public class T_3 {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        Student one = new Student("疑",13);
        Student two = new Student("糖",19);
        Student three = new Student("ing",21);

        list.add(one);
        list.add(two);
        list.add(three);

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(i==list.size()-1){
                System.out.print(stu.getName()+stu.getAge()+"}");
                break;
            }
            System.out.print(stu.getName()+stu.getAge()+"@");
        }
    }
}
