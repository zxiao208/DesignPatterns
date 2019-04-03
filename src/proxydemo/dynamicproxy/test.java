package proxydemo.dynamicproxy;

import java.lang.reflect.Proxy;

public class test {
    //需求：不能购买超
    public static void main(String[] args){
        ShopPhoneImp shopPhoneImp=new ShopPhoneImp();

        //优化写法
        IShopPhone iShopPhone = (IShopPhone) new ShopProxy().newProxyInstance(new ShopPhoneImp());

        //走代理
        iShopPhone.shopUSAPhone("苹果6",4999);
        iShopPhone.shopUSAPhone("苹果x",10888);
        iShopPhone.shopCNPhone("华为p20",6666);
        //不走代理
        shopPhoneImp.shopUSAPhone("苹果x",10888);
    }
}
