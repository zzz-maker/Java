/**
 * 方法的传递机制--基本数值型变量参数
 */
public class MethodUsage {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        swap(a, b);
        System.out.println(a+","+b); // ！ a,b值不变
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
