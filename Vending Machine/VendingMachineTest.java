

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
        VendingMachine test Vendingmachine = new VendingMachine(15);
        int cans = testVendingMachine.getCanCount();
        assertEquals(
    @Test
    public void testFillUp()
    {
        VendingMachine testVendingMachine = new VendingMachine
        testVendingMachine.fillUp(20);
        int cans = testVendingMachine.getCanCount();
        assertEquals(20, cans, 1e-6);
        
        testVendingMachine.fillUp(50);
        cans = testVendingMachine.getCanCount();
        assertEquals(70, cans, 1e-6);
    }
    
    @Test
    public void test
