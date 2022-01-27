import java.util.Scanner;

/*
    猜数
 */
public class GuessNumber {

    public static void main(String[] args) {
        // 创建Scanner读取用户输入
        Scanner in = new Scanner(System.in);

        int rangeStart = 30;
        int rangeEnd = 90;
        int guessTotal = 5;

        int totalGameCount = 0;
        int correctGuessCount = 0;

        boolean gameEnd = false;

        while (!gameEnd) {
            int mod = rangeEnd - rangeStart;
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始结束时间必须为正整数");
            }
            if (mod <= 1) {
                System.out.println("非法的数字范围：（" +  rangeStart + ", " + rangeEnd + "）");
            }
            int numberToGuess = rangeStart + (int)(Math.random() * (rangeEnd - rangeStart));
            int leftToGuess = guessTotal;
            boolean currentGameCounted = false;
            System.out.println("请输入猜测的数字，范围在[" + rangeStart + ", " + rangeEnd + "]之间");
            while (leftToGuess > 0) {
                System.out.println("游戏剩余次数为" + leftToGuess + "次, 请输入本次猜测的数字：");
                int guess = in.nextInt();
                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("用户选择结束游戏。");
                    break;
                }
                if (!currentGameCounted) {
                    totalGameCount++;
                    currentGameCounted = true;
                }
                leftToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    System.out.println("输入的数字正确！");
                    break;
                }
            }
            System.out.println("共进行了" + totalGameCount + "次游戏, 其中正确猜测次数为" + correctGuessCount);
        }


    }
}
