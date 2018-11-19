import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class PerformanceTest {

    private static Order order;
    private static NaturalTree tree = new NaturalTree();
    private  static Decorator deco;
    private static Bill bill;


    @Rule
    public Timeout globalTimeout = new Timeout(1);

    @BeforeClass
    public static void setupBeforeClass() {

        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
        deco = new Candle(new Balls(tree));

    }

    @Test
    public void testBilling() throws Exception {
        bill =new Bill(deco,order,"/var/lib/jenkins/workspace/ttd6new");
    }


}