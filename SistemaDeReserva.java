import java.util.ArrayList;
/**
 * Maneja el Sistema de Reservas.
 * 
 * @author  FRoM
 * @version 2021
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

    public boolean reservaAsientos(Funcion funcion, int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){

        return funcion.reservaAsientos(numeroDeFila, numerosDeAsientos, cliente);
    }

    public boolean cancelaReserva(Funcion funcion, Cliente cliente)
    {
        ArrayList<Cliente> clientes = listaClientesFuncion(funcion);
        for( Cliente clnt : clientes ){
            if( clnt.getNombre().equals( cliente.getNombre() ) ){
                Asiento[] asientos = funcion.getSala().getFilas().get(FILA_PRUEBA).asientosReservados();
                if( asientos.length != 0 ){
                    for( Asiento asiento : asientos ){
                        if( asiento.getCliente().getNombre().equals( cliente.getNombre() ) )
                            asiento.cancelaReserva();
                    }
                }                
            }
        }
        return false;        
    }

    /**
     * Obtiene informacion de reserva para un cliente y funcion de prueba.
     */
    public String getDetallesReserva(Funcion funcion)
    {
        String detalles = "";
        ArrayList<Cliente> clientesFuncion = funcion.getClientes();
        if( clientesFuncion.size() == 0 )
            return "Esta funcion no tiene reservas.";
        Cliente cliente = clientesFuncion.get(INDEX_PRUEBA);           
        Asiento[] asientos = funcion.getSala().getFilas().get(FILA_PRUEBA).asientosReservados();
        if( asientos.length != 0 ){
            detalles = "Su reserva: Fila "+ (FILA_PRUEBA+1) +" - Asientos: ";
            for( Asiento asiento : asientos ){
                if( asiento.getCliente().getNombre().equals( cliente.getNombre() ) )
                    detalles += asiento.getNumero() +"  ";
            }
        }
        return detalles;
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

    public ArrayList<Funcion> getFuncionesXfecha(String fecha){
        ArrayList<Funcion> funcionesXfecha = new ArrayList<>();
        for( Funcion fncn : funciones ){
            if( fncn.getStringFecha().equals(fecha) ){
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
