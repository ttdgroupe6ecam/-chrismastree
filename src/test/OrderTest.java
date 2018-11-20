
import main.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class OrderTest {

    private static Order order;
    private static Customer customer;
    private static DeliveryAddress deliveryAddress;
    
  
    @BeforeClass
    public static void setupBeforeClass() {
        customer = new Customer("Arthur","Venon");
        deliveryAddress = new DeliveryAddress("31 rue de Keersmaeker");
        order =new Order(deliveryAddress,customer);
    }

    @Test
    public void getDeliveryAddress() {
        deliveryAddress = new DeliveryAddress("31 rue de Keersmaeker");
        assertEquals(order.getDeliveryAddress().getAddress(),deliveryAddress);
    }

    @Test
    public void getName() {
        assertEquals(order.getCustomer().getName(),"Arthur");
    }

    @Test
    public void getSurname() {
        assertEquals(order.getCustomer().getSurname(),"Venon");
    }

}



