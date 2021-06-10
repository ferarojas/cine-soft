import java.util.ArrayList;

/**
 * Representa un lugar en una sala de cine para
 * un cliente en una funcion especifica.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Asiento 
{
    private int numero;
    private Cliente cliente;

    public Asiento(int numero){
        this.numero = numero;
        cliente = null;
    }

    public boolean aceptaReserva(){
        if( this.cliente == null ){
            this.cliente = getCliente();
            return true;
        }
        else
            return false;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public boolean cancelaReserva()
    {
        if( this.cliente != null ){
            cliente = null;
            return true;
        }
        else
            return false;
    }

    public boolean estaDisponible(){
        if( cliente == null )
            return true;
        else
            return false;
    }
    
    public int getNumero(){
        return numero;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String toString() {
        return "# " + numero +": "+ cliente;
    }
}
