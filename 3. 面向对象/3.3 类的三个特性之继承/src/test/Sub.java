package test;

public class Sub extends Super {
    private String sn;

    /**
     * super与this调用构造器都应放在该构造器的第一行
     *
     * @param name
     * @param age
     */
    public Sub(String name, int age, String sn) {
        super(name, age);
        this.sn = sn;
    }
}
