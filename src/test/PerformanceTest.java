import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class PerformanceTest {

    private static Order order;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @BeforeClass
    public static void setupBeforeClass() {

        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
    }

    @Test
    public void testBilling() throws Exception {

    }


}