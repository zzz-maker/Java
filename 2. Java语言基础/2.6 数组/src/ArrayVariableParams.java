public class ArrayVariableParams {

    /**
     * 可变参数，本质为数组类型
     * ！！可变参数必须为方法的最后一个参数
     * ！！一个方法的参数中只能有一个可变参数
     * @param arr
     * @return
     */
    public int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
