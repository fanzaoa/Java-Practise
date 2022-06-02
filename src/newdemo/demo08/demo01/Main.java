package newdemo.demo08.demo01;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
