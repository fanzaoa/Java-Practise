package stringd;

/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分

注意事项：
split方法的参数其实是一个“正则表达式”。
如果按照英文句点”."进行划分，必须写“\\.”（两个）
 */
public class StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        System.out.println(array1.length);// 3
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }/* aaa
            bbb
            ccc
        */
        System.out.println("============");

        String str2 = "aaa.bbb.ccc";
        String[] array2 = str2.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
