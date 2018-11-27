/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenproject1.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MediaMonster
 */
public class CustomerTest {
    
    Customer  customer= new Customer("yass", "van");
    
    
    @Test
    public void  testCustomer() {
        
        assertNotNull(customer);
    }
    
    @Test
    public void testGetName() {
        assertEquals(customer.getName(),"yass");
    }
    
     @Test
    public void testSetName() {
        customer.setName("rafa");
        assertEquals(customer.getName(),"rafa");
    }
    
    @Test
    public void testGetSurname() {
        assertEquals(customer.getSurname(),"van");
    }
    
    @Test
    public void testSetSurname() {
        customer.setSurname("rohan");
        assertEquals(customer.getSurname(),"rohan");
    }
   
  
    
     
 
    
 
}
