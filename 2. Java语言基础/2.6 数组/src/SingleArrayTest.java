public class SingleArrayTest {
    public static void main(String[] args) {
        //静态初始化数组，系统根据指定的元素值决定数组的长度
        int[] ages = new int[]{1, 2, 3, 4};
        //动态初始化数组，系统自动为数组元素分配初始值0
        int[] ages2 = new int[6];
        testArray(ages);
    }

    static void testArray(int[] arr) {
        System.out.println(arr.length);

        System.out.println(arr[0]);

        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static long getSum(int[] arr) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }
}
