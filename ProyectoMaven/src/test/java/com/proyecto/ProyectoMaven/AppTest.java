package com.proyecto.ProyectoMaven;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App
 */
public class AppTest {
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    
    @Test
    public void testSuma() {
        System.out.println("suma");
        int num1 = 3;
        int num2 = 5;
        int expResult = 8;
        int result = App.suma(num1, num2);
        assertEquals(expResult, result);
    }
    @Test
    public void testResta() {
        System.out.println("resta");
        int num1 = 5;
        int num2 = 7;
        int expResult = 0;
        int result = App.resta(num1, num2);
        assertEquals(expResult, result);
    }
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int num1 = 10;
        int num2 = 5;
        int expResult = 50;
        int result = App.multiplicacion(num1, num2);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        int num1 = 10;
        int num2 = 0;
        int expResult = 0;
        int result = App.division(num1, num2);
        assertEquals(expResult, result);
    }
}
