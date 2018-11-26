package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class ElectricGarlandTest {

    private static ArtificialTree tree;
    private static ElectricGarland garland;

    @BeforeClass
    public static void setupBeforeClass() {


        tree = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
        garland = new ElectricGarland(tree);
    }

    @Test
    public void getSize() {

        assertTrue(garland.isHasBlink());
    }



    @Test
    public void getToString() {
        assertTrue(garland.toString().toLowerCase().contains(" electricgarland{hasblink=true}"));
    }
}