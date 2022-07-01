package newdemo.demo10.demo02;

public interface ILink<E> {
    public abstract void add(E e) ;
    public int count() ;
    public boolean isEmpty() ;
    public Object[] toArray() ;
    public E get(int index) ;
    public void set(int index,E data) ;
    public boolean contains(E data) ;
    public void remove(E data) ;
    public void clean() ;
}
