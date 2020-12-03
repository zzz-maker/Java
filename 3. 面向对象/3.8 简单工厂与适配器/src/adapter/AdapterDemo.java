package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        IWindow window = new MyWindow();
        window.close();
    }
}
