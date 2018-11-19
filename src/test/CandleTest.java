import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class CandleTest {

    private static NaturalTree tree = new NaturalTree() ;
    private static Decorator deco ;


    @BeforeClass
    public static void setupBeforeClass() {


           deco = new Candle(tree);
           String test = deco.getParfum();
    }


    @Test
    public void testParfum() {
          assertEquals(test," TreeColor: Green CandleColor: White");
    }

}