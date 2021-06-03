import java.util.ArrayList;
/**
 * Maneja el Sistema de Reservas.
 * 
 * @author  FRoM
 * @version 2018
 */
public class SistemaDeReserva
{
    private ArrayList<Funcion> funciones;

    public SistemaDeReserva()
    {
        funciones = new ArrayList<>();
    }

    public ArrayList<Funcion> getFunciones(String titulo)
    {
        return null;
    }

    public ArrayList<Funcion> getFunciones(int dia)
    {
        return null;
    }

    public String getDetalles(Funcion funcion)
    {
        return "";
    }

    boolean reservaAsientos(Cliente cliente, Funcion funcion, int cantidad)
    {
        return false;
    }

    public ArrayList<Asiento> encuetraAsientosContiguos(Fila fila, int cantidad)
    {
        return null;
    }

    public String getDetallesReserva(Cliente cliente)
    {
        return null;
    }

    public ArrayList<Cliente> listaClientesFuncion(Funcion funcion)
    {
        return null;
    }

    public boolean cancela(Cliente cliente)
    {
        return false;        
    }

    public static void main(String[] args) {
    }
}
