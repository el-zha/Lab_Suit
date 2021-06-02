package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeamstressTest {

    @Test
    void askedWhichSuit() {
        //GIVEN
        final Seamstress SeamstressTest = new Seamstress();
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = SeamstressTest.askedWhichSuit(clientTest.getSelectedSuit());
        //THEN
        actual = clientTest.getSelectedSuit();
    }

    @Test
    void askedWhichModel() {
        //GIVEN
        final Seamstress SeamstressTest = new Seamstress();
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = SeamstressTest.askedWhichModel(clientTest.getSelectedModelT());
        //THEN
        actual = clientTest.getSelectedModelT();
    }

    @Test
    void askedWhichMaterial() {
        //GIVEN
        final Seamstress SeamstressTest = new Seamstress();
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = SeamstressTest.askedWhichMaterial(clientTest.getSelectedMaterial());
        //THEN
        actual = clientTest.getSelectedMaterial();
    }

    @Test
    void askedWhichColor() {
        //GIVEN
        final Seamstress SeamstressTest = new Seamstress();
        final Client clientTest = new Client(71, 60, 95, 65, 95,
                50,95, 70,"classic",
                "straight","straight", "viscose",
                "black", "PantSuit");
        //WHEN
        String actual = SeamstressTest.askedWhichColor(clientTest.getSelectedColor());
        //THEN
        actual = clientTest.getSelectedColor();
    }

    @Test
    void parametrs1() {
    }

    @Test
    void parametrs2() {
    }
}