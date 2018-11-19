import org.junit.Test;
import  org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class BallsTest {




    @BeforeClass
    public static void setupBeforeClass() {

    }

    @Test
   public void getSize() {
         NaturalTree tree = new NaturalTree();
         Balls bal1 = new Balls(tree);
     assertEquals(ball.getSize()," BallsSize: Small");
   }



   @Test
   public void getMaterial() {
     assertEquals(ball.getMaterial()," BallsMaterial: Plastic");
   }

}