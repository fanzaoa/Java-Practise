package stringd;

/*
字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==是进行【地址值】的比较。
 */
public class _常量池 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] c = {'a','b','c'};
        String str = new String(c);
        System.out.println(str);
        System.out.println("===========");

        //比较的是地址值
        System.out.println(str1==str2);//true
        System.out.println(str1==str);//false
        System.out.println(str2==str);//false
        System.out.println("==============");

        /*
        public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false.
        注意事项：
        1.任何对象都能用Object进行接受。
        2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
        3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
        推荐："abc".equals(str)       不推荐：str.equals("abc")，因为str为null时，程序会报空指针异常
         */
        //比较内容值
        System.out.println(str1.equals(str2));//true
        System.out.println("============");

        //equalsIgnoreCase()忽略大小写
        String str3 = "Java";
        System.out.println("java".equalsIgnoreCase(str3));//true
    }
}
