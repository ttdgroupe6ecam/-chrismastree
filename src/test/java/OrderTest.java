


import com.mycompany.mavenproject1.*;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class OrderTest {

    private static Customer customer=new Customer("Arthur","Venon");
    private  static Order order =new Order(customer,"31 rue de Keersmaeker");
  
     @Test
    public  void testor() {
       assertNotNull(order);
    }

    @Test
    public  void testGetName() {
        assertEquals(order.getName(),"Arthur");
    }
    @Test
    public  void testGetNa() {
        assertEquals(order.getSurname(),"Venon");
    }
   
}




