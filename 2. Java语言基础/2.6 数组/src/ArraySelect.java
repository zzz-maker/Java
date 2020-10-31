import java.util.Arrays;

/**
 * 获得数组指定元素的角标值
 *
 * @author zhangyj
 * @version 1.0.0 2020-10-31
 */
public class ArraySelect {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 6, 3, 41, 2, -4, 0};
        System.out.println(getIndex(arr, -4));

        System.out.println("--------------------");

        ArrayBubbleSort.sort(arr);

        //Arrays类的使用
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 3));
        System.out.println(Arrays.toString(arr));
        Arrays.binarySearch(arr, 3);
    }

    /**
     * 循环方式找到角标
     * @param arr 数组
     * @param key 指定元素值
     * @return 角标值
     */
    static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分法查询方式
     * @param arr 数组
     * @param key  指定查找数组元素值
     * @return  角标
     */
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while(high >= low) {
            int mid = (low + high) / 2;
            int midVal = arr[mid];

            if (key > midVal) {
                low = mid + 1;
            }
            else if (key < midVal) {
                high = high - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

