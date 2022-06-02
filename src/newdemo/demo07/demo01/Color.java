package newdemo.demo07.demo01;

public enum Color { // 枚举类
    RED("红色"),GREEN("绿色"),BLUE("蓝色") ; // 实例化对象（要在首行）
    private String title ; // 定义属性
    private Color(String title) {
        this.title = title ;
    }
    public String toString() {
        return this.title ;
    }
}

