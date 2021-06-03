
/**
 * Representa un arreglo lineal de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Fila
{
    private Asiento[] asientos;

    public Fila(int cantidad){
        asientos = new Asiento[cantidad];
        for( int i=0; i<cantidad; i++ ){
            asientos[i] = new Asiento(i+1);
        }
    }

    public Asiento[] buscaAsientosContiguos(int cantidad){
        return null;
    }

    /**
     * Reserva todos si estan disponibles; sino ninguno.
     * @param numeros que el cliente a elegido.
     * @param el cliente que hace la reserva.
     */
    public boolean reservaAsientos(int[] numeros, Cliente cliente){
        boolean posible = true;
        for( int numero : numeros ){
            if( asientos[numero-1].estaDisponible() && posible )
                asientos[numero-1].aceptaReserva(cliente);
            else
                posible = false;
        }
        return posible;
    }

    public Asiento buscaAsientoPorNumero(int numero){
        for( Asiento asiento : asientos ){
            if( asiento.getNumero() == numero ){
                return asiento;
            }
        }        
        return null;
    }

    public Asiento[] asientosDisponibles(){
        Asiento[] detectados = new Asiento[asientos.length];
        int index = 0;
        for( Asiento asiento : asientos ){
            if( asiento.estaDisponible() ){
                detectados[index] = asiento;
                index++;
            }
        }
        Asiento[] disponibles = new Asiento[detectados.length];
        index = 0;
        for( Asiento asiento : detectados ){
                disponibles[index] = asiento;
                index++;            
        }
        return disponibles;
    }
}
