
/**
 * Reserva 
 * 
 * @author  FRoM
 * @version 2021
 */
public class Reserva
{
    private Cliente cliente;
    private Funcion funcion;
    int numeroDeFila;
    int[] numerosDeAsientos;
    public Reserva(Funcion funcion, int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){
        this.cliente = cliente;
        this.funcion = funcion;
        this.numeroDeFila = numeroDeFila;
        this.numerosDeAsientos = numerosDeAsientos;
    }

    public String getDetalles(){
        String detalles = "Reserva para "+ cliente.getNombre();       
        if( numerosDeAsientos.length != 0 ){
            detalles += " en Fila "+ numeroDeFila +" - Asientos: ";
            for( int numero : numerosDeAsientos ){
                    detalles += " "+ numero;
            }
        }        
        return detalles;
    }
}
