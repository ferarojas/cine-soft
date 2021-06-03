

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AsientoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AsientoTest
{
    private Asiento asiento1;
    private Asiento asiento2;
    private Cliente cliente1;
    private Cliente cliente2;

    /**
     * Default constructor for test class AsientoTest
     */
    public AsientoTest()
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
        asiento1 = new Asiento(1);
        asiento2 = new Asiento(2);
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

    @Test
    public void testAceptaReserva()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
    }

    @Test
    public void testNoAceptaReserva()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
        assertEquals(false, asiento1.aceptaReserva(cliente2));
    }

    @Test
    public void testCancelaReserva()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
        assertEquals(true, asiento1.cancelaReserva());
    }

    @Test
    public void testNoCancelaReserva()
    {
        assertEquals(false, asiento1.cancelaReserva());
    }

    @Test
    public void testNoCancelaReservaDeNuevo()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
        assertEquals(true, asiento1.cancelaReserva());
        assertEquals(false, asiento1.cancelaReserva());
    }

    @Test
    public void testEstaDisponible()
    {
        assertEquals(true, asiento1.estaDisponible());
    }

    @Test
    public void testNoEstaDisponible()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
        assertEquals(false, asiento1.estaDisponible());
    }

    @Test
    public void testNoHayCliente()
    {
        assertEquals(null, asiento1.getCliente());
    }

    @Test
    public void testGetCliente()
    {
        assertEquals(true, asiento1.aceptaReserva(cliente1));
        assertEquals(cliente1, asiento1.getCliente());
    }
}









