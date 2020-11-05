package dependence;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        Card card = new Card();
        CellPhone cellPhone = new CellPhone(card);
        p1.call();
    }
}
