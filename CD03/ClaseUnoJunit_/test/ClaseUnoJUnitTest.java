

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import claseunojunit_.ClaseUnoJunit_;

/**
*
* @author Admin
*/
public class ClaseUnoJUnitTest {
    
            ClaseUnoJunit_ calc;

public ClaseUnoJUnitTest() {
  System.out.println("Llamando a la función constructora: ClaseUnoJUnitTest");
}

@BeforeClass
public static void setUpClass() {
System.out.println("Llamando a setUpClass, con la etiqueta @BeforeClass");

}

@AfterClass
public static void tearDownClass() {
System.out.println("Llamando a tearDownClass con la etiqueta @AfterClass");
}

@Before
public void setUp() {

System.out.println("Llamando a setUp con la etiqueta @Before");

          calc=new ClaseUnoJunit_(4, 67);
}

@After
public void tearDown() {
System.out.println("Llamando a tearDown con la etiqueta @After");
}

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}
@Test
public void testDevuelveTrue() {

System.out.println("Llamando a testDevuelveTrue con la etiqueta @Test");
}

public void testSuma() {
        
         assertEquals(71, calc.suma());
     
     }
     
     @Test
     public void tesResta()
     {
         
         assertEquals(-63, calc.resta());
     }
     @Test
     public void texDividir()
     {
         ClaseUnoJunit_ calc=new ClaseUnoJunit_(100, 25);
       //  assertTrue(calc.dividir()==1);
         assertEquals("Muy mal, ese no es el resultado de la división",4, calc.dividir());//Lanza ese mensaje si no cuadra
     }

}