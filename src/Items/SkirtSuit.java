package Items;

public class SkirtSuit extends Suit {
    private Skirt skirt;

    public SkirtSuit() {
    }

    public SkirtSuit(Jacket jacket, Skirt skirt, String style, String material, String color, double cost) {
        super(jacket, style, color, material, cost);//Функция для обращения к конструктору родительского класса (авто)
        this.skirt = skirt;
    }
}