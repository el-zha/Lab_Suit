package Main;

import Items.*;

public class Main {
    public static void main(String[] args) {


        boolean isOrdered1 = false;

        Client person1 = new Client(71, 60, 95, 65, 95,
                                    50,95, 70,"classic",

                                     "straight","straight", "viscose",
                                      "black", "PantSuit");

        isOrdered1 = person1.createOrder();
        System.out.println("Клиент №" + Client.getCountClients() + " готов сдеалать заказ.");
        Seamstress seamstress = new Seamstress();
        if (isOrdered1)  {
            String whichSuit1 = seamstress.askedWhichSuit(person1.getSelectedSuit());

            switch (whichSuit1){
                case "PantSuit":{
                    seamstress.parametrs1();
                    seamstress.toSewSuit();
                    PantSuit suitWithPants1 = new PantSuit(new Jacket(person1.getWaist(), person1.getSleeveLength(),
                            person1.getLengthT(),person1.getChest(), person1.getShoulders(),person1.getSelectedModelT()),
                            new Pants(person1.getWaist(), person1.getLengthB(),person1.getHip(),
                            person1.getSelectedModelB(),person1.getInseam()), person1.getSelectedStyle(),
                            person1.getSelectedMaterial(),person1.getSelectedColor());
                    System.out.println("Костюм готов!");
                    if (person1.fittingForP(suitWithPants1)){
                        System.out.println("Костюм с брюками подошел заказчику №" + Client.getCountClients());
                    }
                    break;
                }
                case "SkirtSuit":{
                    seamstress.parametrs2();
                    seamstress.toSewSuit();
                    SkirtSuit suitWithSkirt1 = new SkirtSuit(new Jacket(person1.getWaist(), person1.getSleeveLength(),
                            person1.getLengthT(),person1.getChest(), person1.getShoulders(),person1.getSelectedModelT()),
                            new Skirt(person1.getWaist(), person1.getLengthB(),person1.getHip(),
                            person1.getSelectedModelB()), person1.getSelectedStyle(), person1.getSelectedMaterial(),
                            person1.getSelectedColor());
                    System.out.println("Костюм готов!");
                    if (person1.fittingForS(suitWithSkirt1)){
                        System.out.println("Костюм с юбкой подошел заказчику №" + Client.getCountClients());
                    }
                }
            }

        }
        Client person2 = new Client(80, 70, 100, 70, 100,
                90,86, 80,"retro",
                "straight","slim-fit","wool",
                "grey", "SkirtSuit");
        boolean isOrdered2 = false;
        isOrdered2 = person2.createOrder();
        System.out.println("Клиент №" + Client.getCountClients() + " готов сдеалать заказ.");
        if (isOrdered2)  {
            String whichSuit2 = seamstress.askedWhichSuit(person2.getSelectedSuit());

            switch (whichSuit2){
                case "PantSuit":
                    seamstress.parametrs1();
                    seamstress.toSewSuit();
                    PantSuit suitWithPants2 = new PantSuit(new Jacket(person2.getWaist(), person2.getSleeveLength(),
                            person2.getLengthT(),person2.getChest(), person2.getShoulders(),person2.getSelectedModelT()),
                            new Pants(person2.getWaist(), person2.getLengthB(),person2.getHip(),
                            person2.getSelectedModelB(),person2.getInseam()), person2.getSelectedStyle(),
                            person2.getSelectedMaterial(),person2.getSelectedColor());
                    System.out.println("Костюм готов!");
                    if (person2.fittingForP(suitWithPants2)) {
                        System.out.println("Костюм с брюками подошел заказчику №" + Client.getCountClients());
                    };
                case "SkirtSuit":
                    seamstress.parametrs2();
                    seamstress.toSewSuit();
                    SkirtSuit suitWithSkirt2 = new SkirtSuit(new Jacket(person2.getWaist(), person2.getSleeveLength(),
                            person2.getLengthT(),person2.getChest(), person2.getShoulders(),person2.getSelectedModelT()),
                            new Skirt(person2.getWaist(), person2.getLengthB(),person2.getHip(),
                            person2.getSelectedModelB()), person2.getSelectedStyle(), person2.getSelectedMaterial(),
                            person2.getSelectedColor());
                    System.out.println("Костюм готов!");
                    if (person2.fittingForS(suitWithSkirt2)){
                        System.out.println("Костюм с юбкой подошел заказчику №" + Client.getCountClients());
                    };
            }

        }

    }
}
