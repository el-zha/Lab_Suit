package Items;

public class SkirtSuit extends Suit {
    private Skirt skirt;

    public SkirtSuit() {
    }

    public SkirtSuit(Jacket jacket, Skirt skirt, String style, String material, String color) {
        super(jacket, style, color, material);//Функция для обращения к конструктору родительского класса (авто)
        this.skirt = skirt;
    }
}