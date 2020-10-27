public class Yunsuan {
    public static void main(String[] args) {
        int a = 82;
        int b = a < 54 ? 54 : ++a;    //三元运算
        System.out.println(a & 21);  //按位取与
        System.out.println(a | 21);  //按位取或
        System.out.println(~a);    //按位取反
        System.out.println(a ^ 21);  //按位异或
        System.out.println(b);
    }
}
