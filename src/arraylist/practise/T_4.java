package arraylist.practise;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随即数字[1,100]，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
 */
public class T_4 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100)+1);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数个数："+smallList.size());
        System.out.println(smallList);
    }

    private static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {//自定义方法
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
