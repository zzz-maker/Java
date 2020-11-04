package overide;

public class Ostrich extends Bird {

    /**
     * 方法覆写
     * 遵循原则：
     * 1. 方法签名需要相同（方法名、参数列表）
     * 2. 返回类型可以为更加详细（更小）的或者相同的类型
     * 3. 子类的方法权限应该大于等于父类方法
     */
    @Override
    public void fly() {
        System.out.println("walk");
    }
}
