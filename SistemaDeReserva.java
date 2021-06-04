import java.util.ArrayList;
/**
 * Maneja el Sistema de Reservas.
 * 
 * @author  FRoM
 * @version 2018
 */
public class SistemaDeReserva
{
    private static final int INDEX_PRUEBA = 0;
    private static final int FILA_PRUEBA = 0;
    private ArrayList<Funcion> funciones;

    public SistemaDeReserva()
    {
        funciones = new ArrayList<>();
    }

    boolean reservaAsientos(Funcion funcion, int cantidad)
    {
        return false;
    }

    public boolean cancela(Cliente cliente)
    {
        return false;        
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

    public String getDetallesReserva(Funcion funcion)
    {
        String detalles = "";
        ArrayList<Cliente> clientesFuncion = funcion.getClientes();
        if( clientesFuncion.size() == 0 )
            return "No hay clientes en esa funcion.";
        Cliente cliente = clientesFuncion.get(INDEX_PRUEBA);           
        Asiento[] asientos = funcion.getSala().getFilas().get(FILA_PRUEBA).asientosReservados();
        if( asientos.length != 0 ){
            detalles = "Su reserva: Fila "+ (FILA_PRUEBA+1) +" - Asientos: ";
            for( Asiento asiento : asientos ){
                if( asiento.getCliente().getNombre().equals( cliente.getNombre() ) )
                    detalles += asiento.getNumero() +"  ";
            }
        }
        else
            detalles += "Esta funcion no tiene reservas.";
        return detalles;
    }

    public void agregaFuncion(Funcion funcion){
        funciones.add(funcion);
    }

    public ArrayList<Cliente> listaClientesFuncion(Funcion funcion)
    {
        return funcion.getClientes();
    }

    public ArrayList<Asiento> encuetraAsientosContiguos(Fila fila, int cantidad)
    {
        return null;
    }

    public static void main(String[] args) {
    }
}
