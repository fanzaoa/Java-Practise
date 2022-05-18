package newdemo.demo02;

public class Dept {
    private long deptno ;
    private String dname ;
    private String loc ;
    private Emp emps [] ; //多个雇员信息

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public Dept(long deptno, String dname, String loc) {
        this.deptno = deptno ;
        this.dname = dname ;
        this.loc = loc ;
    }

    // setter、getter、无参构造略
    public String getInfo() {
        return "[部门信息]部门编号 = "+this.deptno+"、部门名称 = "+this.dname+"、部门位置 = "+this.loc ;
    }
}
