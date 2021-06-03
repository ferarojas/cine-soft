

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClienteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClienteTest
{
    private Cliente cliente1;
    private Cliente cliente2;

    /**
     * Default constructor for test class ClienteTest
     */
    public ClienteTest()
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
        cliente2 = new Cliente("pablo", "456");
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
