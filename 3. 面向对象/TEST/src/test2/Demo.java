package test2;

public class Demo {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        mainBoard.usePCI(new SoundCard());

        mainBoard.usePCI(new IPCI() {
            @Override
            public void powerOn() {
                System.out.println("");
            }

            @Override
            public void swapData() {
                System.out.println("");
            }
        });
    }
}
