package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import main.*;

public class MainTest {

    private static NaturalTree tree ;
    private static Decorator deco ;


    @BeforeClass
    public static void setupBeforeClass() {

   //     tree = new NaturalTree();
    //    deco = new Balls(tree);
    }

    @Test
    public void getSize() {

      //  assertEquals(deco.getSize()," BallsSize: Small");
    }



    @Test
    public void getMaterial() {
      //  assertEquals(deco.getMaterial()," BallsMaterial: Plastic");
    }

}