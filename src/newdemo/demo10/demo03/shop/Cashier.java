package newdemo.demo10.demo03.shop;

public class Cashier { // 收银台
    private IShopCar shopCar ;
    public Cashier(IShopCar shopCar) {
        this.shopCar = shopCar ;
    }
    public double allPrice() { // 计算总价
        double all = 0.0 ;
        Object result[] = this.shopCar.getAll() ;
        for(Object obj : result) {
            IGoods goods = (IGoods) obj ;
            all += goods.getPrice() ;
        }
        return all;
    }
    public int allCount() {// 商品数量
        return this.shopCar.getAll().length ;
    }
}
