package newdemo.demo04;

public class SortArray extends Array{ // 定义排序子类

    public SortArray(int len) {
        super(len) ;
    }

    public int[] getArray() { // 获得排序结果
        java.util.Arrays.sort(super.getArr()) ; // 排序
        return super.getArr() ;
    }
}
