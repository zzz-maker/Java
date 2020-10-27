public class ContinueTest {
    public static void main(String[] args) {
        Loop:
        for (int i = 0; i < 3; i++) {
            Loop2:
            for (int y = 0; y < 6; y++) {
                if (y == 4) {
                    continue Loop2;
                }
                System.out.println("i=" + i + "y=" + y);
            }
        }
        System.out.println("---------------------------");


        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                if (y == 4) {
                    continue;
                }
                System.out.println("i=" + i + "y=" + y);
            }
        }
    }
}
