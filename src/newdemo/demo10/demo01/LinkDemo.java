package newdemo.demo10.demo01;

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> all = new LinkImpl<>() ;
        System.out.println("[增加之前]数据个数：" + all.size());
        all.add("wi");
        all.add("ki");
        System.out.println("[增加之后]数据个数：" + all.size());
    }
}
