package singlemodel;

/**
 * 单例模式2
 * 线程不安全
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
    private SingletonLazy() {}
}
