

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    public VendingMachineTest()
    {
    }
    
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetCanCount()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        int cans = testVendingMachine.getCanCount();
        assertEquals(10, cans, 1e-6);
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.fillUp(20);
        int cans = testVendingMachine.getCanCount();
        assertEquals(30, cans, 1e-6);
        
        testVendingMachine.fillUp(50);
        cans = testVendingMachine.getCanCount();
        assertEquals(80, cans, 1e-6);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.insertToken();
        int tokens = testVendingMachine.getTokenCount();
        assertEquals(1, tokens, 1e-6);
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        int tokens = testVendingMachine.getTokenCount();
        assertEquals(0, tokens, 1e-6);
    }
}
