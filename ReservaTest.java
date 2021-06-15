

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ReservaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ReservaTest
{
    private Sala sala1;
    private Funcion funcion1;
    private Cliente cliente1;

    /**
     * Default constructor for test class ReservaTest
     */
    public ReservaTest()
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
        cliente1 = new Cliente("pedro", "123");
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
}
