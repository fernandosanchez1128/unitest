/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author family
 */
public class NominaTest {
    
    public NominaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularSueldoBruto method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoBruto() {
        System.out.println("calcularSueldoBruto");
        Empleado objEmpleado = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSueldoBruto(objEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSueldoReal method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoReal() {
        System.out.println("calcularSueldoReal");
        Empleado objEmpleado = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSueldoReal(objEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSueldosEmpleados method, of class Nomina.
     */
    @Test
    public void testCalcularSueldosEmpleados() {
        System.out.println("calcularSueldosEmpleados");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        double[] expResult = null;
        double[] result = instance.calcularSueldosEmpleados(objEmpleados);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSumaSueldos method, of class Nomina.
     */
    @Test
    public void testCalcularSumaSueldos() {
        System.out.println("calcularSumaSueldos");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSumaSueldos(objEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPromedioSueldos method, of class Nomina.
     */
    @Test
    public void testCalcularPromedioSueldos() {
        System.out.println("calcularPromedioSueldos");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularPromedioSueldos(objEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdEmpleados method, of class Nomina.
     */
    @Test
    public void testObtenerIdEmpleados() {
        System.out.println("obtenerIdEmpleados");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerIdEmpleados(objEmpleados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalAPagar method, of class Nomina.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularTotalAPagar(objEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empleadoGanaMenos method, of class Nomina.
     */
    @Test
    public void testEmpleadoGanaMenos() {
        System.out.println("empleadoGanaMenos");
        Empleado[] objEmpleados = null;
        Nomina instance = new Nomina();
        Empleado expResult = null;
        Empleado result = instance.empleadoGanaMenos(objEmpleados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
