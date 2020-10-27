public class Cirulate {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println(sum);

        //foreach语句-遍历数组
        int arr[] = {7, 4, 5};
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
