
/**
 * Representa un arreglo lineal de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Fila
{
    private Asiento[] asientos;

    public Fila(int cantidad)
    {
        asientos = new Asiento[cantidad];
    }

    public boolean reservaAsientos(int cantidad)
    {
        return false;
    }

    public Asiento[] buscaAsientosPorNumero(int numero)
    {
        return null;        
    }

    public Asiento[] buscaAsientosContiguos(int cantidad)
    {
        return null;
    }

    public Asiento[] buscaAsientosDisponibles(){
        return null;
    }
}
