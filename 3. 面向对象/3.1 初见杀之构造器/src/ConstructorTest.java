public class ConstructorTest {
    public static void main(String[] args) {
        constructorDeemo p = new constructorDeemo();
        System.out.println(p); //输出哈希号
        p.brand = "Huawei";
        p.showInfo();
    }
}


class constructorDeemo {
    constructorDeemo() {}

    String brand;   //

    String color;

    double price;

    void showInfo() {
        System.out.println("brand=" + brand + ", color=" +
                color + ", price=" + price);
    }
}
