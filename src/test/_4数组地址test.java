package test;
//13届蓝桥javaB也是4，堆(需要用到的知识点）
import java.util.Arrays;

public class _4数组地址test {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i;
        }
        System.out.println(Arrays.toString(arrayA));
        System.out.println(arrayA);//地址值
        int[] arrayB = new int[5];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = arrayA[i];
        }
        System.out.println(Arrays.toString(arrayB));
        System.out.println(arrayB);//地址值
    }
}
