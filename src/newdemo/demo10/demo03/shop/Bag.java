package newdemo.demo10.demo03.shop;

public class Bag implements IGoods{
    private String name ;
    private double price ;
    public Bag(String name,double price) {
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
        if (!(obj instanceof Bag)) {
            return false ;
        }
        Bag bag = (Bag) obj ;
        return this.name.equals(bag.name) && this.price == bag.price ;
    }
    public String toString() {
        return "【背包信息】名称：" + this.name + "、价格：" + this.price ;
    }
}
