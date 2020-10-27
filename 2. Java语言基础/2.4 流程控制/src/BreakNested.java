public class BreakNested {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                if (y == 4) {
                    break;
                }
                System.out.println("i=" + i + "y=" + y);
            }
        }

        System.out.println("---------------------------");


        Loop:
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                if (y == 4) {
                    break Loop;
                }
                System.out.println("i=" + i + "y=" + y);
            }
        }
    }
}
