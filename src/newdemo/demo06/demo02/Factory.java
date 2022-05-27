package newdemo.demo06.demo02;

public class Factory {
    public static IFood getInstance(String className) {
        if("milk".equals(className)) {
            return new Milk() ;
        } else if ("bread".equals(className)) {
            return new Bread() ;
        }else {
            return null ;
        }
    }
}
