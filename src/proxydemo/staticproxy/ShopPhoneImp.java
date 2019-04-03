package proxydemo.staticproxy;

public class ShopPhoneImp implements IShopPhone{

    @Override
    public void shop(String Type, double money) {
        System.out.println("您花了"+money+"元购买了"+Type+"手机");
    }
}
