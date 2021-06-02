package Items;

public class PantSuit extends Suit {
    private Pants pants;

    public PantSuit() {

    }

    public PantSuit(Jacket jacket, Pants pants, String style, String material, String color ) {
        super(jacket, style, color, material);
        this.pants = pants;
    }
}