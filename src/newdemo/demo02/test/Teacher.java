package newdemo.demo02.test;

public class Teacher {
    private long tno ;
    private String tname ;
    private Student stus[] ;

    public Student[] getStus() {
        return stus;
    }

    public void setStus(Student[] stus) {
        this.stus = stus;
    }

    public Teacher(long tno, String tname) {
        this.tno = tno;
        this.tname = tname;
    }

    public String getInfo(){
        return "教师编号 = " + this.tno + "、教师姓名" + this.tname;
    }
}
