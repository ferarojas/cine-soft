

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
    private Asiento asiento1;
    private Asiento asiento2;
    private Cliente cliente2;
    private Fila fila1;
    private Sala sala1;
    private Funcion funcion1;
    private Cliente cliente1;
    private SistemaDeReserva sistemaD1;

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
        asiento1 = new Asiento(1);
        asiento2 = new Asiento(2);
        fila1 = new Fila(12);
        sala1 = new Sala("Zalamea", 8, 12);
        sala1 = new Sala("Zalamea", 8, 12);
        funcion1 = new Funcion(sala1, "behind", new Fecha());
        cliente1 = new Cliente("pedro", "123");
        cliente2 = new Cliente("pablo", "456");
        
        sistemaD1 = new SistemaDeReserva();
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
