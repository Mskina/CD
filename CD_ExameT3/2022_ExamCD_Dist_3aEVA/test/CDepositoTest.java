/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import deposito.CDeposito;
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
public class CDepositoTest {

    CDeposito deposito;

    public CDepositoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("*** Iniciando prueba ***");
        deposito = new CDeposito();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test C1 (CAM1)
     */
    @Test
    public void testC1() {
        double entrada = -1;
        double resultado = deposito.llenarPruebas(entrada);
        assertEquals(1, resultado, 0);
    }

    /**
     * Test C2 (CAM2*)
     */
    @Test
    public void testC2() {
        double entrada = -7;
        double resultado = deposito.llenarPruebas(entrada);
        assertEquals(1, resultado, 0);

        /**
         * Importante: facendo as probas, comprobamos que nunca vai pasar polo
         * camiño CAM2, xa que o introducires -7, xa valida no primeiro if. É
         * por iso que comprobamos que o que devolve iCodErr sexa 1:
         * efectivamente, devolve ese número
         */
    }

    /**
     * Test C3 (CAM3)
     */
    @Test
    public void testC3() {
        double entrada = 2;
        double resultado = deposito.llenarPruebas(entrada);
        assertEquals(0, resultado, 0);
    }

}
