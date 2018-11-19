import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class CandleTest {

    private static NaturalTree tree = new NaturalTree() ;
    private static Decorator deco1 ;
    private static Decorator deco2 ;

    @BeforeClass
    public static void setupBeforeClass() {



    }

    @Test
    public void getLifeTime() {
        deco1 = new Candle(new Balls(tree));
         assertEquals(deco1.getLifeTime(),5);
    }



    @Test
    public void getParfum() {
        deco2 = new Candle(new Balls(tree));
          assertEquals(deco2.getParfum()," CandleParfum: Senteurs d'inspiration");
    }

}