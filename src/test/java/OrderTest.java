import com.mycompany.mavenproject1.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class OrderTest {
    
    Customer customer=new Customer("Arthur","Venon");
    DeliveryAddress  deliveryAddress= new DeliveryAddress("Prom. de l'Alma 50, 1200 Woluwe-Saint-Lambert");
    private  Order order =new Order(customer,deliveryAddress);
    
     @Test
    public  void testOrder() {
       assertNotNull(order);
    }

    @Test
    public  void testGetCustomer() {
        assertEquals(order.getCustomer().getName(),"Arthur");
        assertEquals(order.getCustomer().getSurname(),"Venon");
    }
    
    @Test
    public  void testDeliveryAddress() {
        assertEquals(order.getDeliveryAddress().getAddress(),"Prom. de l'Alma 50, 1200 Woluwe-Saint-Lambert");
    }
    
   
   
}




