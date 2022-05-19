package newdemo.demo03;


public class Member {

    private String mid ;
    private String name ;
    private Role role[] ;

    public Role[] getRole() {
        return role;
    }

    public void setRole(Role[] role) {
        this.role = role;
    }

    public Member(String mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public String getInfo() {
        return "[用户信息] mid = " + this.mid + "、name = " + this.name ;
    }
}
