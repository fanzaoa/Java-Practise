package newdemo.demo10.demo02;

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> iLink = new LinkImpl<>() ;
        iLink.add("mtf");
        iLink.add("wiki");
        iLink.add("aa");
        iLink.remove("aa");
        iLink.clean();
        System.out.println(iLink.count() + " " + iLink.isEmpty());
        Object[] a = iLink.toArray() ;
        if(a != null) {
            for (Object arr : a) {
                System.out.println(arr);
            }
        }
//        System.out.println(iLink.get(0));
//        System.out.println(iLink.get(4));
//        iLink.set(0,"fox");
//        System.out.println(iLink.get(0));
//        System.out.println(iLink.contains("wiki"));
    }
}
