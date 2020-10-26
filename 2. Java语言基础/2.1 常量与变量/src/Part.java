public class Part {
    static final double PI = 3.14;  //final 关键字 常量
    static int age = 23;        //  全局变量（成员变量） 作用域：全类
    static int times = 3;
    public static void main(String[] args){
        final int number = 1235;    //局部变量   作用域：声明的代码块中   使用前必须先赋值
        age = 22;
        int times = 4;
        System.out.println(PI);
        System.out.println(number);
        System.out.println(age);
        System.out.println(times);
    }
}
