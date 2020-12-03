package test;

public class NormalMan extends Person {
    @Override
    public void eat() {
        System.out.println("eat normally");
    }

    @Override
    public void sit() {
        System.out.println("sit normally");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
