package test;

public class _5类型转换 {
    public static void main(String[] args) {
        System.out.println('0');//(char)0
        System.out.println('0'+1);//(int)49
        zifu();
        System.out.println("===========");
        System.out.println(sum(123));
    }

    public static void zifu(){
        char zifu1 = 'A';
        System.out.println(zifu1);//A
        /*
        byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算
        */
        System.out.println(zifu1+1);//66
        System.out.println("====================");
        char zifu2 = 'A'+1;
        System.out.println(zifu2);//B
        System.out.println(zifu2+1);//67
    }


    private static int sum(int x) {
        // TODO Auto-generated method stub
        String s = String.valueOf(x);//将一个整数转换为int参数的字符串表示形式
        int sum = 0;
        //将整数的个、十、百...位一一相加
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}
