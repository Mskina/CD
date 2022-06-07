/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarcaracter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mskin
 */
public class OperacionsArraysTest {

    OperacionsArrays busca;

    public OperacionsArraysTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Lo que querramos que pase antes de que se inicien los test
        // Inicializar variables que vayan a compartir todos los test, por ej.
    }

    @AfterClass
    public static void tearDownClass() {
        // Se llama al acabar, 1 vez
    }

    @Before
    public void setUp() {
        busca = new OperacionsArrays();
        // Se llama una vez por cada test (antes de hacerlo)
    }

    @After
    public void tearDown() {
        // Se llama una vez por cada test (al finalizarlo)
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    /**
     * assertEquals(resultado esperado, resultado actual): le pasamos el
     * resultado que nosotros esperamos y invocamos la función que estamos
     * testando.
     *
     * --> En decimales, assertEquales(res esparado, res actual, desviación
     * permitidida)
     *
     * assertNull(objeto): si un objeto es null el test sera exitoso.
     * assertNotNull(objeto): al contrario que el anterior.
     * assertTrue(condición): si la condición pasada (puede ser una función que
     * devuelva un booleano) es verdadera el test sera exitoso.
     * assertFalse(condición): si la condición pasada (puede ser una función que
     * devuelva un booleano) es falsa el test sera exitoso. assertSame(Objeto1,
     * objeto2): compara las referencias de los objetos. assertNotSame(Objeto1,
     * objeto2): al contrario que el anterior.
     * 
     * 
     * --> Excepciones: último caso
     * 
     */
    @Test
    public void testC1() {
        // Arrange
        char entrada = 'B';
        char[] array = {};
        // Act
        boolean resultado = busca.busca(entrada, array);
        // Assert
        assertFalse(resultado);
    }

    @Test
    public void testC2A() {
        // Arrange
        char entrada = 'B';
        char[] array = {'A'};
        // Act
        boolean resultado = busca.busca(entrada, array);
        // Assert
        assertFalse(resultado);
    }

    @Test
    public void testC2B() {
        // Arrange
        char entrada = 'B';
        char[] array = {'B'};
        // Act
        boolean resultado = busca.busca(entrada, array);
        // Assert
        assertTrue(resultado);
    }

    @Test
    public void testC3A() {
        // Arrange
        char entrada = 'B';
        char[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        // Act
        boolean resultado = busca.busca(entrada, array);
        // Assert
        assertTrue(resultado);
    }

    @Test
    public void testC3B() {
        // Arrange
        char entrada = 'R';
        char[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        // Act
        boolean resultado = busca.busca(entrada, array);
        // Assert
        assertFalse(resultado);
    }

    @Test(expected = NullPointerException.class)
    public void testC4() {
        char entrada = 'B';
        char[] array = null;
        boolean resultado = busca.busca(entrada, array);
    }
}
