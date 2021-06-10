

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FuncionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FuncionTest
{
    private Sala sala1;
    private Funcion funcion1;

    /**
     * Default constructor for test class FuncionTest
     */
    public FuncionTest()
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
        sala1 = new Sala("Zalamea", 8, 12);
        funcion1 = new Funcion(sala1, "left behind", new Fecha());
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
        assertEquals(true, sala1.aceptaReserva(3, numerosDeAsientos));
    }
}

