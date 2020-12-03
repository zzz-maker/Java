package test5;

public class Cat extends Animal implements Walkable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + "walk");
    }

    public void climbTree() {
        System.out.println(super.getName() + "climb tree");
    }
}
