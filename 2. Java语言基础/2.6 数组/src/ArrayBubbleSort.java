/**
 * 数组元素的冒泡排序法
 * @author zhangyj
 * @version 1.0.0 2020-10-30
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 7, 9, 1};
        sort(arr);
        // ！！ i为临时变量，不能改变实际数组元素的值
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 冒泡排序方法
     * @param arr
     */
    static void sort(int[] arr) {
        for (int i = 0;i < arr.length - 1;i++) {
            for (int j = 0;j < arr.length - i - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
