/**
 * 数组的选择排序法
 *
 * @author zhangyj
 * @version 1.0.0 2020-10-30
 */
public class ArraySelectedSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 7};
        System.out.println("最大值为" + getMax(arr));
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 获得数组中元素的最大值
     *
     * @param arr
     * @return
     */
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 选择排序--两两比较
     */
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
