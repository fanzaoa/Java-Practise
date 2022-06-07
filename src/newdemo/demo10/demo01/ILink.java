package newdemo.demo10.demo01;

public interface ILink<E> { // 设置泛型避免安全隐患
    public void add(E e) ; // 增加数据
    public int size() ; // 获取数据的个数
}
