package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class BallsTest {

    private static ArtificialTree tree1;
    private static Balls ball;

    @BeforeClass
    public static void setupBeforeClass() {


        tree2 = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
        ball = new Balls(tree2);
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