package test;

public class ArtMan extends Person {
    @Override
    public void eat() {
        System.out.println("eat slowly");
    }

    @Override
    public void sit() {
        System.out.println("sit formally");
    }
}
