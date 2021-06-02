package Main;

import Items.PantSuit;
import Items.SkirtSuit;

public class Client {
    private static int countClients;
    private int waist, sleeveLength, lengthB, lengthT, chest, shoulders, hip, inseam;
    private String selectedStyle, selectedModelB, selectedModelT, selectedMaterial, selectedColor;
    private String selectedSuit;


    public static int getCountClients() {
        return countClients;
    }
    public int getWaist() {
        return waist;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public int getLengthB() {
        return lengthB;
    }

    public int getLengthT() {
        return lengthT;
    }

    public int getChest() {
        return chest;
    }

    public int getShoulders() {
        return shoulders;
    }

    public int getInseam() {
        return inseam;
    }

    public int getHip() {
        return hip;
    }

    public String getSelectedStyle() {
        return selectedStyle;
    }

    public String getSelectedModelB() {
        return selectedModelB;
    }

    public String getSelectedModelT() {
        return selectedModelT;
    }

    public String getSelectedMaterial() {
        return selectedMaterial;
    }

    public String getSelectedColor() {
        return selectedColor;
    }

    public String getSelectedSuit() {
        return selectedSuit;
    }

    public Client(int waist, int sleeveLength, int lengthB, int lengthT,
                  int chest, int shoulders, int hip, int inseam, String selectedStyle,
                  String selectedModelB, String selectedModelT, String selectedMaterial,
                  String selectedColor, String selectedSuit) {
        this.waist = waist;
        this.sleeveLength = sleeveLength;
        this.lengthB = lengthB;
        this.lengthT = lengthT;
        this.chest = chest;
        this.shoulders = shoulders;
        this.hip = hip;
        this.inseam = inseam;
        this.selectedStyle = selectedStyle;
        this.selectedModelB = selectedModelB;
        this.selectedModelT = selectedModelT;
        this.selectedMaterial = selectedMaterial;
        this.selectedColor = selectedColor;
        this.selectedSuit = selectedSuit;
        ++countClients;

    }

    public boolean createOrder() {
        return true;
    }

    public boolean fittingForP(PantSuit suit) {
        return true;
    }

    public boolean fittingForS(SkirtSuit suit) {
        return true;
    }
}