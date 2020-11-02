/**
 * static修饰的类成员
 *
 * @author zhangyj
 * @version 1.0.0 2020-11-02
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Person.num);
        System.out.println(new Person().age);    //实例成员调用
        System.out.println(new Person().num);    //warning

        Person p1 =  new Person();
        p1.num = 95;
        System.out.println(p1.num);
        System.out.println(new Person().num);

    }
}

class Person {
    String name;

    int age;

    static int num = 100;
}
