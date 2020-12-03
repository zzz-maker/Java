package test1;

public class Refrigerator {
    private String brand;

    public Refrigerator(String brand) {
        super();
        this.brand = brand;
    }

    public void open() {
        System.out.println("open the door");
    }

    /**
     *
     * @param elephant
     */
    public void input(Elephant elephant) {

    }

    public void close() {
        System.out.println("close the door");
    }
}
