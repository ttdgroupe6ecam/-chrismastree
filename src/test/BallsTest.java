import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class BallsTest {

    private static ChrismasTree tree = new ChrismasTree();
    private static Decorator bal1 = new Balls(tree);


    @BeforeClass
    public static void setupBeforeClass() {

    }

    @Test
    public void getSize() {

        assertEquals(ball.getSize()," BallsSize: Small");
    }



    @Test
    public void getMaterial() {
        assertEquals(ball.getMaterial()," BallsMaterial: Plastic");
    }

}