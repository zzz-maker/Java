public class Compare {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 7;
        System.out.println((number1++ < number2));
        System.out.println((number1++ < number2));
        System.out.println((number1++ == --number2));
    }
}
