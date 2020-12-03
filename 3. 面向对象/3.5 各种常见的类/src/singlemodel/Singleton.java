package singlemodel;

/**
 * 单例模式，项目只允许一个对象实例存在
 * 线程安全
 * @version 1.0.0
 * @author zhangyj
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {}
}
