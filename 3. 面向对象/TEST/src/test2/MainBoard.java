package test2;

public class MainBoard {
    /**
     *
     * @param card
     */
    public void usePCI(IPCI card) {
        card.powerOn();
        card.swapData();
    }
}
