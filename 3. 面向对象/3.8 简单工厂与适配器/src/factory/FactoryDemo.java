package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ICellPhone phone = CellphoneFactory.getInstance("iphone");
        if (phone != null) {
            phone.sendMsg();
        }
    }
}
