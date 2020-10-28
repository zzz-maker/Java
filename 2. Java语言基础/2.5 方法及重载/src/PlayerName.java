public class PlayerName {
    public static void main(String[] args) {
        System.out.println(getPlayerName(1));
    }
    /**
     * 获得玩家姓名
     * @param x 数值
     * @return  姓名
     */
    static String getPlayerName(int x) {
        String s;
        switch (x) {
            case 1:
                s = "大明";
                break;
            case 2:
                s = "二明";
                break;
            case 3:
                s = "小明";
                break;
            default:
                s = "没有该名玩家";
        }
        return s;
    }
}
