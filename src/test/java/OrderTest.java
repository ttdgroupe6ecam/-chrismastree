

import com.mycompany.mavenproject1.Order;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.BeforeClass;

public class OrderTest {

    private  Order order =new Order("31 rue de Keersmaeker","Arthur","Venon");
    
    
  
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




