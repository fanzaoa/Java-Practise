package newdemo.demo10.demo03;

public class LinkDemo {
    public static void main(String[] args) {
        ILink<Integer> iLink = new LinkImpl<>() ;
        iLink.add(2009) ;
        iLink.add(3) ;
        iLink.add(31) ;
        System.out.println(iLink.size());
        System.out.println(iLink.isEmpty());
        iLink.printToArray();
        System.out.println("========数据操作==========");
        System.out.println(iLink.get(0));
        iLink.set(1,2);
        System.out.println(iLink.get(1));
        System.out.println(iLink.contains(2009));
        System.out.println(iLink.contains(1));
        iLink.remove(31);
        System.out.println(iLink.get(2));
        iLink.clean();
        iLink.printToArray();
    }
}
