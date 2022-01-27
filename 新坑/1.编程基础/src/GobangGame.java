import java.util.Scanner;

/*
    五子棋
 */
public class GobangGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean gameEnd = false;
        System.out.println("五子棋游戏启动!\n\n\n");
        while (!gameEnd) {
            int gameSize, totalCount = 0;
            boolean winStatus = false;
            System.out.println("新的一局开始，请选择游戏的棋盘大小：");
            do {
                gameSize = in.nextInt();
                if (gameSize < 5) {
                    System.out.println("棋盘大小不能小于5，请重新选择：");
                } else if (gameSize > 100) {
                    System.out.println("棋盘大小不能大于100，请重新选择：");
                }
            } while (gameSize < 5 || gameSize > 100);
            int[][] table = new int[gameSize][gameSize];
            System.out.println("五子棋棋局开始！\n\n");
            while (!winStatus) {
                drawingBoard(table);
                int chess;
                if (totalCount % 2 == 0) {
                    System.out.println("白方请落子，落子范围为0至" + gameSize + "：");
                    chess = 1;
                } else {
                    System.out.println("黑方请落子，落子范围为0至" + gameSize + "：");
                    chess = 2;
                }
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                if (x < 0 || y < 0) {
                    gameEnd = true;
                    System.out.println("游戏终了！");
                    break;
                }
                if (table[x][y] != 0) {
                    System.out.println("此位置已有子，请重新选择落子位置");
                    continue;
                } else {
                    table[x][y] = chess;
                }
                if (checkWin(table, x, y, chess)) {
                    System.out.println((totalCount % 2 == 0 ? "白方":"黑方") + "胜，终盘" + totalCount + "子");
                    drawingBoard(table);
                    break;
                }
                totalCount++;
            }
        }
    }

    private static void drawingBoard(int[][] table) {
        System.out.println("棋盘当前状态：");
        for (int i = 0 ; i < table.length ; i++) {
            for (int j = 0 ; j < table[i].length ; j++) {
                switch (table[i][j]) {
                    case 0 :
                        System.out.print("十 ");
                        break;
                    case 1:
                        System.out.print("白 ");
                        break;
                    case 2:
                        System.out.print("黑 ");
                        break;
                    default:
                        throw new RuntimeException("程序出错");
                }
            }
            System.out.print("\n");
        }
    }

    private static boolean checkWin(int[][] table, int x, int y, int chess) {
        int count = 1;
        // 校验水平
        for (int yAxios = y - 1; yAxios >= 0; yAxios--) {
            if (chess == table[x][yAxios]) {
                count++;
            } else {
                break;
            }
        }
        for (int yAxios = y + 1; yAxios < table[0].length ; yAxios++) {
            if (chess == table[x][yAxios]) {
                count ++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        } else {
            count = 1;
        }
        // 校验垂直
        for (int xAxios = x - 1; xAxios >= 0; xAxios--) {
            if (chess == table[xAxios][y]) {
                count++;
            } else {
                break;
            }
        }
        for (int xAxios = x + 1; xAxios < table.length ; xAxios++) {
            if (chess == table[xAxios][y]) {
                count ++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        } else {
            count = 1;
        }
        // 校验左上至右下
        for (int xAxios = x - 1, yAxios = y - 1; xAxios >= 0 && yAxios >= 0 ; ) {
            if (chess == table[xAxios][yAxios]) {
                count++;
            } else {
                break;
            }
            xAxios--;
            yAxios--;
        }
        for (int xAxios = x + 1, yAxios = y + 1; xAxios <= table.length && yAxios <= table[0].length; ) {
            if (chess == table[xAxios][yAxios]) {
                count++;
            } else {
                break;
            }
            xAxios++;
            yAxios++;
        }
        if (count >= 5) {
            return true;
        } else {
            count = 1;
        }
        // 校验左下至右上
        for (int xAxios = x - 1, yAxios = y + 1; xAxios >= 0 && yAxios <= table[0].length ; ) {
            if (chess == table[xAxios][yAxios]) {
                count++;
            } else {
                break;
            }
            xAxios--;
            yAxios++;
        }
        for (int xAxios = x + 1, yAxios = y - 1; xAxios <= table.length && yAxios >= 0; ) {
            if (chess == table[xAxios][yAxios]) {
                count++;
            } else {
                break;
            }
            xAxios++;
            yAxios--;
        }
        if (count >= 5) {
            return true;
        } else {
            return false;
        }
    }

}
