package dependence;

public class CellPhone {
    private Card card;          //CellPhone依赖于Card
    CellPhone(Card card) {
        this.card = card;
    }
}
