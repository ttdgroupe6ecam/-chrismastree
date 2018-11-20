
import christmastree.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class OrderTest {

    private static Order order;
    
    
  
    @BeforeClass
    public static void setupBeforeClass() { customer = new Customer("Arthur","Venon");
        
        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
    }

    @Test
    public void getDeliveryAddress() {
        
        assertEquals(order.getDeliveryAddress(),deliveryAddress);
    }

    @Test
    public void getName() {
        assertEquals(order.getName(),"Arthur");
    }

    @Test
    public void getSurname() {
        assertEquals(order.getSurname(),"Venon");
    }

}




