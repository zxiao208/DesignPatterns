package proxydemo.dynamicproxy;

public class ShopPhoneImp implements IShopPhone{

    @Override
    public void shopCNPhone(String Type, double money) {
        System.out.println("您花了"+money+"元购买了国产手机"+Type);
    }

    @Override
    public void shopUSAPhone(String Type, double money) {
        System.out.println("您花了"+money+"元购买了美国手机"+Type);
    }
}
