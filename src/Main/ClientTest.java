package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {


    @Test
    void getWaist() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getWaist();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSleeveLength() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getSleeveLength();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getLengthB() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getLengthB();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getLengthT() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getLengthT();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getChest() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getChest();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getShoulders() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getShoulders();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getInseam() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getInseam();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getHip() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        int actual = clientTest.getHip();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedStyle() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedStyle();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedModelB() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedModelB();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedModelT() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedModelT();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedMaterial() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedMaterial();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedColor() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedColor();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void getSelectedSuit() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = clientTest.getSelectedSuit();
        //THEN
        assertNotNull(actual);
    }

    @Test
    void createOrder() {
        //GIVEN
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        boolean actual = clientTest.createOrder();
        //THEN
        actual = true;
    }

    @Test
    void fittingForP() {

    }

    @Test
    void fittingForS() {

    }
}