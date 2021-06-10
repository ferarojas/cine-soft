

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SistemaDeReservaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SistemaDeReservaTest
{
    private SistemaDeReserva sistemaD1;
    private Sala sala1;
    private Funcion funcion1;

    /**
     * Default constructor for test class SistemaDeReservaTest
     */
    public SistemaDeReservaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        sistemaD1 = new SistemaDeReserva();
        sala1 = new Sala("Zalamea", 8, 12);
        funcion1 = new Funcion(sala1, "behind", new Fecha());
        sistemaD1.agregaFuncion(funcion1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testReservaAsientos()
    {
        int[] numerosDeAsientos = {1,3,5};        
        assertEquals(true, sistemaD1.reservaAsientos(funcion1, 1, numerosDeAsientos));
    }
}

