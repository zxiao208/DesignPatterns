package proxydemo.staticproxy;

public class ShopProxy implements IShopPhone {
    private IShopPhone shopPhoneImp;

    public ShopProxy(IShopPhone shopPhoneImp) {
        this.shopPhoneImp = shopPhoneImp;
    }

    @Override
    public void shop(String Type, double money) {
        if(money>5000) {
            System.out.println(Type+"手机价格是"+money+"元,太贵了您买不起");
        }else{
            shopPhoneImp.shop(Type, money);
        }
    }
}
