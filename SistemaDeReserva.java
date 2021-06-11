import java.util.ArrayList;
import java.util.HashMap;
/**
 * Maneja el Sistema de Reservas.
 * 
 * @author  FRoM
 * @version 2021
 */
public class SistemaDeReserva
{
    private static final int FILA_PRUEBA = 0;
    private ArrayList<Funcion> funciones;
    private HashMap<String, Reserva> reservas;

    public SistemaDeReserva()
    {
        funciones = new ArrayList<>();
        reservas = new HashMap<>();
    }

    public boolean reservaAsientos(Funcion funcion, int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){
        boolean seReservo = funcion.reservaAsientos(numeroDeFila, numerosDeAsientos, cliente);
        if( seReservo ){
            Reserva reserva = new Reserva(funcion, numeroDeFila, numerosDeAsientos, cliente);
            reservas.put(cliente.getTelefono(), reserva);
        }            
        return seReservo;
    }

    /**
     * Obtiene informacion de reserva para un cliente y funcion.
     * @param el telefono del cliente; actua como clave de busqueda.
     */
    public String getDetallesReserva(String telefono)
    {
        String detalles = null;
        Reserva reserva = reservas.get(telefono);
        if( reserva != null )
            detalles = reserva.getDetalles();
        return detalles;
    }

    public Reserva cancelaReserva(String telefono)
    {
        return reservas.remove(telefono);
    }

    public ArrayList<Funcion> getFuncionesXtitulo(String titulo)
    {
        ArrayList<Funcion> funcionesXtitulo = new ArrayList<>();
        for( Funcion fncn : funciones ){
            if( fncn.getPelicula().equals(titulo) ){
                funcionesXtitulo.add( fncn );
            }            
        }
        return funcionesXtitulo;
    }

    public ArrayList<Funcion> getFuncionesXDia(int dia){
        ArrayList<Funcion> funcionesXfecha = new ArrayList<>();
        for( Funcion fncn : funciones ){
            if( fncn.getFecha().getDiaDelMes() == dia ){
                funcionesXfecha.add( fncn );
            }            
        }
        return funcionesXfecha;
    }

    public ArrayList<Funcion> getFunciones(){

        return funciones;
    }

    public String getDetalles(Funcion funcion)
    {
        return funcion.getDetalles();
    }

    public void agregaFuncion(Funcion funcion){
        funciones.add(funcion);
    }

    private ArrayList<Cliente> listaClientesFuncion(Funcion funcion)
    {
        return funcion.getClientes();
    }

    public ArrayList<Asiento> encuetraAsientosContiguos(int fila, int cantidad)
    {
        return null;
    }

    public static void main(String[] args) {
    }
}
