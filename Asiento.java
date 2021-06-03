import java.util.ArrayList;

/**
 * Representa un lugar en una sala de cine para
 * un cliente en una funcion especifica.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Asiento 
{
    private int numero;
    private boolean disponible;
    private Cliente cliente;

    public Asiento(int numero) {
        this.numero = numero;
        disponible = true;
    }

    public boolean aceptaReserva()
    {
        if( disponible ){
            disponible = false;
            return true;
        }
        else
            return false;
    }

    public boolean cancelaReserva()
    {
        if( !disponible ){
            disponible = true;
            return true;
        }
        else
            return false;
    }

    public boolean getEstado(){
        return disponible;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String toString() {
        return "# " + numero +": "+ disponible;
    }
}
