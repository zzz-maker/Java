package singlemodel;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        SingletonLazy s2 = SingletonLazy.getInstance();
    }
}
