package newdemo.demo10.demo03.shop;

import newdemo.demo10.demo03.ILink;
import newdemo.demo10.demo03.LinkImpl;

public class ShopCarImpl implements IShopCar {
    private ILink<IGoods> allGoods = new LinkImpl<>() ;
    @Override
    public void add(IGoods goods) {
        this.allGoods.add(goods);
    }

    @Override
    public void delete(IGoods goods) {
        this.allGoods.remove(goods);
    }

    @Override
    public Object[] getAll() {
        return this.allGoods.toArray();
    } // 购物车
}
