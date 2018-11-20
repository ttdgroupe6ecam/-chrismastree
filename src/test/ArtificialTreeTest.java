package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import main.ArtificialTree;

public class ArtificialTreeTest {

    private static ArtificialTree tree1;
    private static ArtificialTree tree2;

    @BeforeClass
    public static void setupBeforeClass() {


        tree2 = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
    }

    @Test
    public void constructStandard() {
        tree1 =new ArtificialTree();
        assertEquals(tree1.getPlasticType(),"plasticType: plasticTypeA");
    }



    @Test
    public void getToString() {
        assertEquals(tree2.toString()," ArtificialTree{plasticType: bisphenol A}");
    }

}