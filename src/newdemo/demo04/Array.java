package newdemo.demo04;

public class Array { // 数组的操作类

    private int[] arr ; // 整型数组
    private int foot ; // 进行数组索引控制

    public Array(int len) {
        if(len > 0) {
            this.arr = new int[len] ; // 开辟数组
        }else {
            this.arr = new int[1] ; // 开辟一个空间
        }
    }

    // 实现数组的容量扩充，给出的是扩充大小，实际大小：已有大小+扩充大小
    public void increment(int num) {
        int[] newArr = new int[this.arr.length + num] ;
        System.arraycopy(this.arr,0,newArr,0,this.arr.length);
        this.arr = newArr ;
    }

    public boolean add(int num) { // 判断数组数据添加及添加
        if(foot < this.arr.length) {
            this.arr[foot++] = num;
            return true ;
        }
        return false ;
    }

    public int[] getArr() {
        return this.arr ;
    }
}
