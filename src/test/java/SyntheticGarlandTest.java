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
public class SyntheticGarlandTest {
    
   ArtificialTree  treeDecorator= new ArtificialTree("ArtificialTree", 120, "red", "plastic");
    
    SyntheticGarland syntheticGarland1 = new SyntheticGarland("square","Yellow", "syntheticGarland",70.5,40.2, treeDecorator);
    SyntheticGarland syntheticGarland2 = new SyntheticGarland(treeDecorator);

   
    
    @Test
    public void  testSyntheticGarlandWithArguments() {
        
        assertNotNull(syntheticGarland1);
    }
    
    @Test
    public void  testSyntheticGarlandWithOneArgument() {
        
        assertNotNull(syntheticGarland2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(syntheticGarland1.getDescription()," TreeDescription: ArtificialTree SyntheticGarlandDecorator: syntheticGarland");
    }
  
     @Test
    public void testGetNotDescription() {
        assertNotEquals(syntheticGarland1.getDescription()," SyntheticGarlandDecorator: SyntheticGarland");
    }
    
    @Test
    public void testGetDescriptionSyntheticGarlandWithOneArgument() {
        assertEquals(syntheticGarland2.getDescription()," TreeDescription: ArtificialTree SyntheticGarlandDecorator: Garland");
    }
   
    @Test
    public void testGetNotDescriptionSyntheticGarlandWithOneArgument() {
        assertNotEquals(syntheticGarland2.getDescription()," SyntheticGarlandDecorator: SyntheticGarland");
    }
    
     
    @Test
    public void testGetPrice() {
        assertEquals(syntheticGarland1.getPrice(),190.5,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(syntheticGarland2.getPrice(),70.5,0.0f);
    }
     
    @Test
    public void testGetColor() {
        assertEquals(syntheticGarland1.getColor()," TreeColor: red SyntheticGarlandColor: Yellow");
    }
    
     @Test
    public void testGetNotColor() {
        assertNotEquals(syntheticGarland1.getColor()," TreeColor:red SyntheticGarlandColor:Yellow");
    }
    
    
    @Test
    public void testGetNotLength() {
        assertNotEquals(syntheticGarland1.getLength(),40);
    }
   
    @Test
    public void testGetLength() {
        assertEquals(syntheticGarland1.getLength(),40.2,0.0f);
    }
    
    @Test
    public void testGetNotPaillette() {
        assertNotEquals(syntheticGarland1.getPaillette(),"square");
    }
   
    @Test
    public void testGetPaillette() {
        assertEquals(syntheticGarland1.getPaillette()," SyntheticGarlandPaillette: square");
    }
    
    
  
}
