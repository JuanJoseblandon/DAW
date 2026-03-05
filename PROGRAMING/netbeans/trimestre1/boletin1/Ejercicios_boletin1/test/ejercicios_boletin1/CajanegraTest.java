/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicios_boletin1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WacheR
 */
public class CajanegraTest {
    
    public CajanegraTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Cajanegra.sumar(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
