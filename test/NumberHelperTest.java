/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testIsEven1() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testIsEven1() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            }
    @Test
    public void testIsOdd1() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            }
     @Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 4;
        NumberHelper instance = new NumberHelper(7);
        int expResult =11;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
     @Test
    public void testSum1() {
        System.out.println("sum");
        int n = 7;
        NumberHelper instance = new NumberHelper(20);
        int expResult =27;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
        public void testIsPrime1() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of isDisisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDisisibleBy() {
        System.out.println("isDisisibleBy");
        int n = 16;
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = true;
        boolean result = instance.isDisisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
        /**
     * Test of isDisisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDisisibleBy1() {
        System.out.println("isDisisibleBy");
        int n = 7;
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = false;
        boolean result = instance.isDisisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
        @Test
    public void testIsDisisibleBy2() {
        System.out.println("isDisisibleBy");
        int n = 10;
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isDisisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
