package singletondemo;
//普通的懒加载，什么时候用什么时候加载，不用不会耗费内存，存在线程安全问题

//什么是单例模式
public class LazySingleton {
    private static LazySingleton singleton;
    public static LazySingleton getinstance(){
        if(singleton==null){
            singleton=new LazySingleton();
        }
        return singleton;
    }
}
