package newdemo.demo03;


public class Main {
    public static void main(String[] args) {
        // 第一步：根据结构设置对象数据
        Member memA = new Member("mldn-a","张三");
        Member memB = new Member("mldn-b","李四");
        Member[] members = new Member[]{memA,memB};// 用于遍历用户信息
        Role roleA = new Role(1L,"系统配置");
        Role roleB = new Role(2L,"备份管理");
        Role roleC = new Role(3L,"人事管理");
        Privilege priA = new Privilege(1000L,"系统初始化");
        Privilege priB = new Privilege(1001L,"系统还原");
        Privilege priC = new Privilege(1002L,"系统环境修改");
        Privilege priD = new Privilege(2000L,"备份员工数据");
        Privilege priE = new Privilege(2001L,"备份部门数据");
        Privilege priF = new Privilege(2002L,"备份公文数据");
        Privilege priG = new Privilege(3000L,"增加员工");
        Privilege priH = new Privilege(3001L,"编辑员工");
        Privilege priI = new Privilege(3002L,"浏览员工");
        Privilege priJ = new Privilege(3003L,"员工离职");

        // 增加角色与权限的对应关系
        roleA.setPrivilege(new Privilege[]{priA,priB,priC});
        roleB.setPrivilege(new Privilege[]{priD,priE,priF});
        roleC.setPrivilege(new Privilege[]{priG,priH,priI,priJ});

        // 增加权限与角色对应
        priA.setRole(roleA);
        priB.setRole(roleA);
        priC.setRole(roleA);
        priD.setRole(roleB);
        priE.setRole(roleB);
        priF.setRole(roleB);
        priG.setRole(roleC);
        priH.setRole(roleC);
        priI.setRole(roleC);
        priJ.setRole(roleC);

        // 增加角色与用户的对应关系
        roleA.setMember(new Member[]{memA,memB});
        roleB.setMember(new Member[]{memA});
        roleC.setMember(new Member[]{memA});

        memA.setRole(new Role[]{roleA,roleB,roleC});
        memB.setRole(new Role[]{roleA});

        // 第二步：根据要求获取数据
        System.out.println("-----------通过用户查找信息-----------");
        for (int i = 0; i < members.length; i++) {// 遍历用户信息
            System.out.println(members[i].getInfo());
            for (int x = 0;x<members[i].getRole().length;x++){
                System.out.println("\t|-"+members[i].getRole()[x].getInfo());
                for (int j = 0; j < members[i].getRole()[x].getPrivilege().length; j++) {
                    System.out.println("\t\t|-"+members[i].getRole()[x].getPrivilege()[j].getInfo());
                }
            }
        }
        System.out.println("-----------通过角色查找信息-----------");
        System.out.println(roleA.getInfo());
        System.out.println("\t|-" +"浏览此角色下的所有权限信息");
        for (int i = 0; i < roleA.getPrivilege().length; i++) {
            System.out.println("\t\t|-"+roleA.getPrivilege()[i].getInfo());
        }
        System.out.println("\t|-" +"浏览此角色下的所有用户信息");
        for (int i = 0; i < roleA.getMember().length; i++) {
            System.out.println("\t\t|-"+roleA.getMember()[i].getInfo());
        }

        System.out.println("-----------通过权限查找信息------------");
        System.out.println(priA.getInfo());
        for (int i = 0; i < priA.getRole().getMember().length; i++) {
            System.out.println("\t|-" +priA.getRole().getMember()[i].getInfo());
        }
    }
}
