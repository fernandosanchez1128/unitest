/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromaximo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fersanq
 */
public class NumeroMaximoTest {
    
    public NumeroMaximoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        //antes 
        System.out.println("Ejecutando la tarea");
    }
    
    @After
    public void tearDown() {
        //terminar
        System.out.println("terminar la tarea");
    }

    /**
     * Test of calcularMaximo method, of class NumeroMaximo.
     */
    @Test
    public void testCalcularMaximo() {
        System.out.println("calcularMaximo");
        System.out.println("camino1");
        
        int x = 6;
        int y = 3;
        int z = 2;
        int expResult = 0;
        int result = NumeroMaximo.calcularMaximo(x, y, z);
        //mira que le resultado obtenido sea el esperado
        assertEquals(6, result);
        System.out.println("espera 6 y obtuvo"+ result );
        
        System.out.println("camino2");
        x = 1;
        y = 5;
        z = 4;
        expResult = 0;
        result = NumeroMaximo.calcularMaximo(x, y, z);
        assertEquals(5, result);
        System.out.println("espera 5 y obtuvo"+ result );
        
        
        System.out.println("camino3");
        x = 2;
        y = 4;
        z = 10;
        expResult = 0;
        result = NumeroMaximo.calcularMaximo(x, y, z);
        assertEquals(10, result);
        System.out.println("espera 10 y obtuvo"+ result );
        // TODO review the generated test code and remove the default call to fail.
        //hace que falle no se para que pero lo hace 
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NumeroMaximo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumeroMaximo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
