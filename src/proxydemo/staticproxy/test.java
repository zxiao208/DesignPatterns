package proxydemo.staticproxy;

public class test {
    //需求，您只有5000元，超过5000的手机买不起
      public static void main(String[] args){
          //委托对象
          IShopPhone iShopPhone = new ShopPhoneImp();
          //代理对象
          ShopProxy shopProxy=new ShopProxy(iShopPhone);
          //通过代理过滤方法
          shopProxy.shop("华为mate9",4500);
          shopProxy.shop("苹果xs",9888);
      }
}
