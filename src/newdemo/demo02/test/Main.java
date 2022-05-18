package newdemo.demo02.test;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"教师");
        // 优化
        Student[] student = new Student[]{
                new Student(1,"学生A"),
                new Student(2,"学生B"),
                new Student(3,"学生C")
        };
        teacher.setStus(student);
        for (int i = 0; i < student.length; i++) {
            student[i].setTeacher(teacher);
            if(i < student.length-1) {
                student[i].setMgr(student[i + 1]);
            }
        }
//        Student studentA = new Student(1,"学生A");
//        Student studentB = new Student(2,"学生B");
//        Student studentC = new Student(3,"学生C");
//        teacher.setStus(new Student[]{studentA,studentB,studentC});
//        studentA.setMgr(studentB);
//        studentB.setMgr(studentC);
//        studentA.setTeacher(teacher);
//        studentB.setTeacher(teacher);
//        studentC.setTeacher(teacher);
        System.out.println(teacher.getInfo());
        for (int i = 0; i < teacher.getStus().length; i++) {
            System.out.println("\t|-" + teacher.getStus()[i].getInfo());
            if (teacher.getStus()[i].getMgr() != null) {
                System.out.println("\t\t|-" + teacher.getStus()[i].getMgr().getInfo());
            }
        }
        System.out.println(student[1].getTeacher().getInfo());
    }
}
