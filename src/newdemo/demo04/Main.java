package newdemo.demo04;

public class Main {
    public static void main(String[] args) {

        ReverseArray array = new ReverseArray(3) ;
        System.out.println(array.add(3)) ;
        System.out.println(array.add(10)) ;
        System.out.println(array.add(1)) ;
        array.increment(2) ;
        System.out.println(array.add(20)) ;
        System.out.println(array.add(5)) ;

        int[] result = array.getArray() ;
        for(int i : result) {
            System.out.print(i+" ");
        }
    }
}
