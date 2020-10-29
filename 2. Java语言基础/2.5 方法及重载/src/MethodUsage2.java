/**
 * 方法的传递机制----引用型变量参数
 * 内存栈的区别
 */
public class MethodUsage2 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7};
        swap(arr, 0, 2);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void swap(int[]arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
