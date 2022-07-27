package newdemo.demo10.demo03.shop;

public class JavaDemo {
    public static void main(String[] args) {
        IShopCar car = new ShopCarImpl() ;
        car.add(new Book("Java开发",79.8));
        car.add(new Bag("背包",880));
        Cashier cas = new Cashier(car) ;
        System.out.println("总价格：" + cas.allPrice() + "、购买总数：" + cas.allCount());
    }
}
