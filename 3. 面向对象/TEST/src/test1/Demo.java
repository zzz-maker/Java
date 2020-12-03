package test1;

public class Demo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("No1");
        Refrigerator refrigerator = new Refrigerator("No2");

        refrigerator.open();
        refrigerator.input(elephant);
        refrigerator.close();
    }
}
