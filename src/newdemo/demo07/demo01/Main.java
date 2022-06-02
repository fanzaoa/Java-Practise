package newdemo.demo07.demo01;

public class Main {
    public static void main(String[] args) {
        for(Color c : Color.values()) {
            System.out.println(c);
            /*
            红色
            绿色
            蓝色
             */
//            System.out.println(c.ordinal()+" - "+c.name());
            /*
            0 - RED
            1 - GREEN
            2 - BLUE
             */
        }
    }
}
