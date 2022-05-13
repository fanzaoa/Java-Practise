package stringd.practise;

/*
拼接字符串
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class T_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrayToString(arr);
        System.out.println(str);
    }

    private static String arrayToString(int[] arr) {
        String str1 = "[";// 定义字符串用于拼接
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str1 += "word"+arr[i]+"]";
            }else {
                str1 += "word" + arr[i] + "#";
            }
        }
        return str1;
    }
}
