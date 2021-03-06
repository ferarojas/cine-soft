

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalaTest
{
    private Cliente cliente1;
    private Sala sala1;

    /**
     * Default constructor for test class SalaTest
     */
    public SalaTest()
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
        cliente1 = new Cliente("pedro", "123");
        sala1 = new Sala("Zalamea", 8, 12);
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
    public void testAceptaReserva()
    {
        int[] numerosDeAsientos = {1,2,3,4};
        assertEquals(true, sala1.aceptaReserva(3, numerosDeAsientos, cliente1));
    }
}

