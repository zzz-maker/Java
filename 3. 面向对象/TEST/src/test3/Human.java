package test3;

abstract public class Human {
    abstract void beforeDinner();
    abstract void afterDinner();

    public void eat() {
        System.out.println("eat");
    }

    final public void sleep() {
        System.out.println("sleep");
    }

    public void show() {
        beforeDinner();
        eat();
        afterDinner();
        sleep();
    }
}
