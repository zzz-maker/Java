public class EnumDemo {
    public static void main(String[] args) {
        Gender person = Gender.MAN;
        System.out.println(person); // MAN

        // values()静态方法，返回所有枚举对象
        Gender[] genders = Gender.values();
        for (Gender g : genders) {
            //打印对象，即调用对象的toString()方法
            System.out.println(g);
        }

        //valueOf(string name)静态方法，返回与name相同的枚举对象
        Gender man = Gender.valueOf("MAN");


        // String name = man.name();  对象的名字
        // int number = man.ordinal();   对象的序号，默认从0开始
    }
}
