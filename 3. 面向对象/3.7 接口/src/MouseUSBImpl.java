/**
 * 接口的实现类， Impl
 */
public class MouseUSBImpl implements IUSB, IPCI {
    @Override
    public void swapData() {
        System.out.println("Mouse_Moving");
    }

    @Override
    public void usePCI() {
        System.out.println("PCI_Moving");
    }
}
