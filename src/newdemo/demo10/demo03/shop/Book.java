package newdemo.demo10.demo03.shop;

public class Book implements IGoods{
    private String name ;
    private double price ;
    public Book(String name,double price) {
        this.name = name ;
        this.price = price ;
    }

    @Override
    public String getName() {
        return this.name ;
    }

    @Override
    public double getPrice() {
        return this.price ;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false ;
        }
        if (this == obj) {
            return true ;
        }
        if (!(obj instanceof Book)) {
            return false ;
        }
        Book book = (Book) obj ;
        return this.name.equals(book.name) && this.price == book.price ;
    }
    public String toString() {
        return "【图书信息】名称：" + this.name + "、价格：" + this.price ;
    }
}
