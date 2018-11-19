import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class CandleTest {


    @Test
    public void testParfum() {
        NaturalTree tree = new NaturalTree() ;
        deco = new Candle(tree);
          assertEquals(deco.getParfum()," TreeColor: Green CandleColor: White");
    }

}