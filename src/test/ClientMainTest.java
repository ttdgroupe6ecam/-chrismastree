import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;
import static org.mockito.Mockito.*;

public class ClientMainTest {

    private static ClientMain client =new ClientMain();


    @Test
    public void getOrder() throws Exception {

        IntegerAsker asker = mock(IntegerAsker.class);
        when(asker.ask("Client's name :")).thenReturn("Arthur");
        when(asker.ask("Client's surname :")).thenReturn("Venon");
        when(asker.ask("Client's adress :")).thenReturn("31 rue de Keersmaeker");
        Order order;
        order = client.makeOrder(asker);
        assertEquals(order.getName(),"Arthur");
    }
}