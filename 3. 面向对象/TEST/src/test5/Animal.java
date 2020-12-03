package test5;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + "sleep");
    }

    public String getName() {
        return name;
    }
}
