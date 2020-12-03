package test5;

public class Tiger extends Animal implements Walkable, Swimmable {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + "walk");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + "swim");
    }

    public void eat() {
        System.out.println(super.getName() + "eat meat");
    }
}
