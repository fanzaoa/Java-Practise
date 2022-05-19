package newdemo.demo03;

public class Role {

    private long rid ;
    private String title ;
    private Member member[] ;
    private Privilege privilege[] ;

    public Privilege[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege[] privilege) {
        this.privilege = privilege;
    }

    public Member[] getMember() {
        return member;
    }

    public void setMember(Member[] member) {
        this.member = member;
    }

    public Role(long rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public String getInfo() {
        return "[角色信息]rid = " + this.rid + "、title = " + this.title ;
    }
}
