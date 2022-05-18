package newdemo.demo02;

public class Emp {
    private long empno ;
    private String ename ;
    private String job ;
    private double sal ;
    private double comm ;



    //表的外键关联 = 引用关联；
    private Dept dept; // 所属部门
    private Emp mgr; // 所属领导

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp getMgr() {
        return mgr;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }
    //



    public Emp(long empno, String ename, String job, double sal, double comm) {
        this.empno = empno ;
        this.ename = ename ;
        this.job = job ;
        this.sal = sal ;
        this.comm = comm ;
    }

    // setter、getter、无参构造略
    public String getInfo() {
        return "[雇员信息]雇员编号 = "+this.empno+"、雇员姓名 = "+this.ename+"、雇员职位 = "+this.job
                +"、基本工资 = "+this.sal+"、佣金 = "+this.comm;
    }
}
