public class MethodTest3 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
        System.out.println(getSum(1000));
        System.out.println(getSum(10000));
    }
    static long getSum(int max) {
        long sum = 0;
        for (int i = 1;i <= max;i++) {
            sum += i;
        }
        return sum;
    }
}
