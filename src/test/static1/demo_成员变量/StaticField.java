package test.static1.demo_成员变量;

public class StaticField {

    public static void main(String[] args) {
        Student one = new Student("张三",18);
        one.room = "101教室";
        System.out.println("姓名："+one.getName()+",学号："+one.getAge()
                            +",教室："+Student.room+",编号："+one.getId());

        Student two = new Student("李四",20);
        System.out.println("姓名："+two.getName()+",学号："+two.getAge()
                            +",教室："+two.room+",编号："+two.getId());
    }
}
