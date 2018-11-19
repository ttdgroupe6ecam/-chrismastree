import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceTest {

    private static Order order;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @BeforeClass
    public static void setupBeforeClass() {

        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
    }

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(100); // sleep for 100 seconds
    }

    @Test
    public void testBlockForever() throws Exception {
        log += "ran2";
        latch.await(); // will block
    }
}