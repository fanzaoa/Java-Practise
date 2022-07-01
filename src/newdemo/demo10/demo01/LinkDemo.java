package newdemo.demo10.demo01;

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> all = new LinkImpl<>() ;
        System.out.println("[增加之前]数据个数：" + all.size() + "、是否为空集合" + all.isEmpty());
        all.add("wi");
        all.add("ki");
        all.add("aa");
        all.remove("aa");
        all.clean();
        System.out.println("[增加之后]数据个数：" + all.size() + "、是否为空集合" + all.isEmpty());
        Object[] result = all.toArray() ;
        if(result != null) {
            for (Object obj : result) {
                System.out.println(obj);
            }
        }
//        System.out.println(all.get(1));
//        all.set(1,"a");
//        System.out.println(all.get(1));
//        System.out.println(all.contains("wi"));

    }
}
