package Items;

public class PantSuit extends Suit {
    private Pants pants;

    public PantSuit() {

    }

    public PantSuit(Jacket jacket, Pants pants, String style, String material, String color, double cost ) {
        super(jacket, style, color, material, cost);
        this.pants = pants;
    }
}