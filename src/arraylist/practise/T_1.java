package arraylist.practise;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1~33之间的随即整数，添加到集合，并遍历集合。
 */
public class T_1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        //随机整数添加到集合
        for (int i = 0; i < 6; i++) {
            int rNum = r.nextInt(33)+1;
            list.add(rNum);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
