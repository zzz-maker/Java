package test2;

public class SoundCard implements IPCI {
    @Override
    public void swapData() {
        System.out.println("DATA SWAPED");
    }

    @Override
    public void powerOn() {
        System.out.println("power ON");
    }
}
