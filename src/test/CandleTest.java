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
    public void getLifeTime() {

         assertEquals(tree.getLifeTime(),5);
    }



    @Test
    public void getParfum() {
          assertEquals(tree.toString()," CandleParfum: Senteurs d'inspiration");
    }

}