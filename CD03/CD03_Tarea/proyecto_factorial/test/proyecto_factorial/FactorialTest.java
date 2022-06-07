/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_factorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iván Estévez
 */
public class FactorialTest {
        
    Factorial factorial;
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("*** Iniciando paquete de pruebas ***");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("*** Finalizando paquete de pruebas ***");
    }
    
    @Before
    public void setUp() {
        System.out.println("*** Iniciando prueba ***");
        factorial = new Factorial();
    }
    
    @After
    public void tearDown() {
        System.out.println("*** Prueba finalizada ***");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testC1() throws Exception {
        // Arrange
        byte entrada = 0;
        // Act
        float resultado = factorial.factorial(entrada);
        // Assert
        assertEquals(1,resultado,0); // Añado tercer valor para evitar el Deprecated
    }
    
    @Test
    public void testC2() throws Exception {
        byte entrada = 1;
        float resultado = factorial.factorial(entrada);
        assertEquals(1,resultado,0);
    }
    
    @Test
    public void testC3() throws Exception {
        byte entrada = 127;
        float resultado = factorial.factorial(entrada);
        assertEquals(Float.POSITIVE_INFINITY,resultado,0);
    }
    
    @Test(expected = Exception.class)
    public void testC4() throws Exception {
        byte entrada = -1;
        float resultado = factorial.factorial(entrada);
    }
    
    //C5 no se puede probar ya que en un byte no cabe '128'. Esa responsabilidad recae en 'main'
    
    @Test
    public void testC6() throws Exception {
        byte entrada = 4;
        float resultado = factorial.factorial(entrada);
        assertEquals(24,resultado,0);
    }
    
    //C7 no se puede probar ya que un byte no admite decimales. Esa responsabilidad recae en 'main'
    
}
