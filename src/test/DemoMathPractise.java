package test;

/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class DemoMathPractise {

    public static void main(String[] args) {
        int ans = 0;
        for(double i=Math.ceil(-10.8);i<=Math.floor(5.9);i++){
            double abs = Math.abs(i);
            if(abs>6 || abs<2.1){
                System.out.print(i+" ");// 输出符合要求的
                ans++;
            }
        }
        System.out.println();
        System.out.println("有"+ans+"个");
    }
}
