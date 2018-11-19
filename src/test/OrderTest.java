import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import Order;

public class OrderTest {

    private static Order order;

    @BeforeClass
    public static setupBeforeClass() {

        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
    }

    @Test
    public getDeliveryAddress() {
        assertEquals(order.getDeliverryAddress(),"31 rue de Keersmaeker");
    }

    @Test
    public getName() {
        assertEquals(order.getName(),"Arthur");
    }

    @Test
    public getSurname() {
        assertEquals(order.getSurname(),"Venon");
    }

}




}