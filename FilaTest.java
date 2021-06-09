

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FilaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FilaTest
{
    private Fila fila1;

    /**
     * Default constructor for test class FilaTest
     */
    public FilaTest()
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
        fila1 = new Fila(12);
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
    public void testBuscaPorNumero()
    {
        assertEquals(1, fila1.buscaAsientoPorNumero(1).getNumero());
    }

    @Test
    public void testReservaPorNumero()
    {
        int[] numerosDeAsientos = {1,2,3,4};
        assertEquals(true, fila1.reservaAsientos(numerosDeAsientos));
    }

    @Test
    public void testAsientosDisponibles1()
    {
//         int cantidad = fila1.getAsientos().length;
//         assertEquals(cantidad, fila1.asientosDisponibles().length);
    }

    @Test
    public void testAsientosDisponibles2()
    {
//         int[] numerosDeAsientos = {1,3,5};
//         int cantidad = fila1.getAsientos().length - 3;
//         assertEquals(true, fila1.reservaAsientos(numerosDeAsientos));
//         assertEquals(cantidad, fila1.asientosDisponibles().length);
    }

    @Test
    public void testAsientosReservados1()
    {
        int cantidad = 0;
        assertEquals(cantidad, fila1.asientosReservados().length);
    }

    @Test
    public void testAsientosReservados2()
    {
        int[] numerosDeAsientos = {1,3,5};
        int cantidad = numerosDeAsientos.length;
        assertEquals(true, fila1.reservaAsientos(numerosDeAsientos));
        assertEquals(cantidad, fila1.asientosReservados().length);
    }
}

