import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class CandleTest {

    private static NaturalTree tree ;
    private static Decorator deco ;


    @BeforeClass
    public static void setupBeforeClass() {

           tree = new NaturalTree();
           deco = new Candle(tree);
    }

    @Test
    public void getLifeTime() {

         assertEquals(deco.getLifeTime(),5);
    }



    @Test
    public void getParfum() {
          assertEquals(deco.getParfum()," CandleParfum: Senteurs d'inspiration");
    }

}