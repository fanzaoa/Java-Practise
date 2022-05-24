package newdemo.demo04;

public class ReverseArray extends Array{

    public ReverseArray(int len) {
        super(len);
    }

    public int[] getArray() { // 反转数组
        int center = super.getArr().length / 2 ;
        int head = 0 ;
        int tail = super.getArr().length - 1 ;
        for (int i = 0; i < center; i++) {
            int temp = super.getArr()[head] ;
            super.getArr()[head] = super.getArr()[tail] ;
            super.getArr()[tail] = temp ;
            head ++ ;
            tail -- ;
        }
        return super.getArr() ;
    }
}
