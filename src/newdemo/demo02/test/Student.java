package newdemo.demo02.test;

public class Student {
    private long sno;
    private String sname;
    private Teacher teacher;
    private Student mgr;

    public Student getMgr() {
        return mgr;
    }

    public void setMgr(Student mgr) {
        this.mgr = mgr;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(long sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public String getInfo(){
        return "学生编号 = " + this.sno +"" +"、学生姓名 = " + this.sname;
    }
}
