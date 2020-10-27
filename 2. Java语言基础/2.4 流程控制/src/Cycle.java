public class Cycle {
    public static void main(String[] args) {
        int a = 100;
        while (a == 100) {
            System.out.println(1);
            break;
        }
        do {
            System.out.println(2);
            a--;
        } while (a == 100);
    }
}
