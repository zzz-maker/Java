package adapter;

public class MyWindow extends WindowsAdapter {
    @Override
    public void close() {
        System.out.println("close my window");
    }
}
