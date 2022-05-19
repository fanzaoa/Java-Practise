package newdemo.demo03;

public class Privilege {

    private long pid ;
    private String title ;
    private Role role ;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Privilege(long pid, String title) {
        this.pid = pid;
        this.title = title;
    }

    public String getInfo() {
        return "[权限信息]pid = " + this.pid + "、title = " + this.title ;
    }
}