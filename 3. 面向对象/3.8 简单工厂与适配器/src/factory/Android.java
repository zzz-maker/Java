package factory;

public class Android implements ICellPhone {
    @Override
    public void sendMsg() {
        System.out.println("I am the factory.Android");
    }
}
