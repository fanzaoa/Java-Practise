package stringd.practise;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
1.既然用到键盘输入，肯定是Scanner
2.键盘输入的是字符串，那么：String str = sc.next();
3.定义四个变量，分别代表四种字符各自的出现次数。
4.需要对字符串一个字、一个字检查、String-->char[],方法就是toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
6.打印输出四个变量，分别代表四种字符出现次数。
 */
public class T_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int countUpper = 0;// 大写字母
        int countLower = 0;// 小写字母
        int countNumber = 0;// 数字
        int countOther = 0;// 其他

        char[] chars = str.toCharArray();// 将当前字符串拆分成为字符数组作为返回值。
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if('A'<=aChar && aChar<='Z'){
                countUpper++;
            }else if('a'<=aChar && aChar<='z'){
                countLower++;
            }else if('0'<=aChar && aChar<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有"+countUpper+"个");
        System.out.println("小写字母有"+countLower+"个");
        System.out.println("数字有"+countNumber+"个");
        System.out.println("其他有"+countOther+"个");
    }
}
