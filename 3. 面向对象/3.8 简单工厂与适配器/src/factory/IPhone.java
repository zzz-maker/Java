package factory;

public class IPhone implements ICellPhone {
    @Override
    public void sendMsg() {
        System.out.println("i am the factory.IPhone");
    }
}
