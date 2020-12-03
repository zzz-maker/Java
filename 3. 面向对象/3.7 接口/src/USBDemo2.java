public class USBDemo2 {
    public static void main(String[] args) {
        IUSB mouse = new MouseUSBImpl();
        mouse.swapData();
    }
}
