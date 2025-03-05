/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package carPartsInventory;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mianm
 */
public class TestInventoryClass {
    private Inventory in ;
    
    public TestInventoryClass() {
       
    }
    
 
    @Before
    public void setUp() {
         CarPart c = new CarPart(1200,70,"Engine"); 
         CarPart p = new CarPart(1300,80,"Engine"); 
         CarPart r = new CarPart(1400,90,"Engine"); 
         CarPart q = new CarPart(1500,95,"Engine"); 
         CarPart a = new CarPart(1200,70,"Brake"); 
         CarPart b = new CarPart(1300,80,"Brake"); 
         CarPart e = new CarPart(1400,90,"Brake"); 
         CarPart d = new CarPart(1500,95,"Brake"); 
         List<CarPart> cp = new ArrayList<>();
         cp.add(c);
         cp.add(p);
         cp.add(r);
         cp.add(q);
         cp.add(a);
         cp.add(b);
         cp.add(e);
         cp.add(d);
         
         in = new Inventory(cp);
         
    }
    
    @Test 
    public void testReplace()
    {
        assertEquals(95,in.replace("Engine").getDurability());
        assertEquals(1500,in.replace("Engine").getPrice());
        assertEquals(95,in.replace("Brake").getDurability());
        assertEquals(1500,in.replace("Brake").getPrice());
        CarPart ex = new CarPart(1500,95,"Engine");
        assertEquals(ex.toString(),in.replace("Engine").toString());
        
    }
    @Test
    public void testCheapestPart()
    {
        assertEquals(70,in.cheapestPart("Engine").getDurability());
        assertEquals(1200,in.cheapestPart("Engine").getPrice());
        assertEquals(70,in.cheapestPart("Brake").getDurability());
        assertEquals(1200,in.cheapestPart("Brake").getPrice());
        CarPart ex = new CarPart(1200,70,"Engine");
        assertEquals(ex.toString(),in.cheapestPart("Engine").toString());
        
    }
    @Test
    public void testCount()
    {
        assertEquals(4,in.count("Engine"));
        assertNotEquals(5,in.count("Engine"));
        assertEquals(4,in.count("Brake"));
        assertNotEquals(5,in.count("Brake"));
    }
    @Test
    public void testtotalValue()
    {
        assertEquals(10800,in.totalValue());
        
    }
    
    @Test
    public void testtotalValuePart()
    {
        assertEquals(5400,in.totalValuePart("Engine"));
        assertEquals(5400,in.totalValuePart("Brake"));
    }
    @Test
    public void testAddPart()
    {
        CarPart crr = new CarPart(1450,93,"Engine");
        in.addpart(crr);
        assertEquals(5,in.count("Engine"));
    }
    @Test
    public void testsearchPart()
    {
        CarPart cr = new CarPart(1500,95,"Engine");
        assertEquals(cr.toString(),in.searchPart(98, "Engine").toString());
        CarPart crr = new CarPart(1200,70,"Engine"); 
        assertEquals(crr.toString(),in.searchPart(1200, "Engine").toString());
        assertNotNull("should not null",in.searchPart(98, "Engine"));
        assertNull("should be null",in.searchPart(-1, "Engine"));
      
    }
    
    
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
