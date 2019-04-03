package singletondemo;
//饿汉单例 线程安全，占用内存资源
public class HungrySingleton {
    private static HungrySingleton singleton=new HungrySingleton();
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
