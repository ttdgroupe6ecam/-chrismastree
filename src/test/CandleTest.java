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
    }


    @Test
    public void toString() {
          assertEquals(deco.toString()," TreeColor: Green CandleColor: White");
    }

}