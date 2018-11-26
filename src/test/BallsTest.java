package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class BallsTest {

    private static ArtificialTree tree;
    private static Balls ball;

    @BeforeClass
    public static void setupBeforeClass() {


        tree = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
        ball = new Balls(tree);
    }

    @Test
    public void getSize() {

    assertEquals(ball.getSize(), " BallsSize: Small");
    }



    @Test
    public void getToString() {
        //assertEquals(tree2.toString()," ArtificialTree{plasticType: bisphenol A}");
    }

}