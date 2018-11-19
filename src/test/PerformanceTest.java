import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class PerformanceTest {

    private  Order order;
    private NaturalTree tree = new NaturalTree();
    private Decorator deco;
    private Bill bill;


    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

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