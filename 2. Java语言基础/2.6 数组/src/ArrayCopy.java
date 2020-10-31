import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        for (int i = 0; i <= args.length; i++) {
            String c = args[i];
            System.out.println(c);
        }

        String[] src = new String[] {"A", "b", "c", "d"};

        String[] target = new String[5];

        System.arraycopy(src, 1, target, 3, 2);

        System.out.println(Arrays.toString(target));
    }
}
