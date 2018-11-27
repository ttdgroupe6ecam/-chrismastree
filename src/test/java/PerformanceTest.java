
import com.mycompany.mavenproject1.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PerformanceTest {

    private static Order order;
    private static Customer customer;
    private static NaturalTree tree = new NaturalTree();
    private  static Decorator deco;
    private static Bill bill;




    @BeforeClass
    public static void setupBeforeClass() {
        customer=new Customer("Arthur","Venon");
        order =new Order(customer,"31 rue de Keersmaeker");
        deco = new Candle(new Balls(tree));

    }

    @Test(timeout=20)
    public void testBilling() throws Exception {
      //  bill =new Bill(deco,order,"output");
    }


}
