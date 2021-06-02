package Items;

public class Pants extends Bottom{
    private int inseam;
    public Pants(int waist, int length, int hip, String model, int inseam) {
        super(waist, length, hip, model);
        this.inseam = inseam;
    }

    public Pants() {
    }
}
