public class PrivateTest {
    public static void main(String[] args) {
        Person person = new Person("James", 12);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}

/**
 * private修饰的实例成员,仅可当前类可访问
 * 暴露间接访问字段方法 getter/setter (垃圾代码馍)
 */
class Person {
    private String name;
    private int age;
    private boolean bool; // 布尔类型注意is/set

    Person() {
    }
    Person(String name) {
        this.name = name;
    }

    /**
     * 巧用this关键字去除重复代码
     * 对this构造器的调用必须放在构造器中，且为构造器的第一条语句
     * @param name
     * @param age
     */
    Person(String name, int age) {
        this(name);
        this.age = age;
    }

    Person(String name, int age, boolean bool) {
        this(name, age);
        this.bool = bool;
    }

    void showDetails() {
        System.out.println(name + "and" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 130) {
            System.out.println("error");
            return;
        }
        this.age = age;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }
}
