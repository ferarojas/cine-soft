
/**
 * Representa un arreglo lineal de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Fila
{
    private Asiento[] asientos;

    /**
     * @param cantidad de asientos de esta fila.
     */    
    public Fila(int cantidad){
        asientos = new Asiento[cantidad];
        for( int i=0; i<asientos.length; i++ ){
            asientos[i] = new Asiento(i+1);
        }
    }

    /**
     * Reserva todos si estan disponibles; sino ninguno.
     * @param numeros que el cliente a elegido.
     * @param el cliente que hace la reserva.
     */
    public boolean reservaAsientos(int[] numeros){
        boolean posible = true;
        for( int numero : numeros ){
            if( asientos[numero-1].estaDisponible() && posible )
                asientos[numero-1].aceptaReserva();
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

    public Asiento[] asientosReservados(){
        Asiento[] detectados = new Asiento[asientos.length];
        int index = 0;
        for( Asiento asiento : asientos ){
            if( ! asiento.estaDisponible() ){
                detectados[index] = asiento;
                index++;
            }
        }
        Asiento[] reservados = new Asiento[index];
        index = 0;
        for( Asiento asiento : detectados ){
            if( asiento != null ){
                reservados[index] = asiento;
                index++;            
            }
        }
        return reservados;
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
        if( detectados.length == 0 )
            return null;
        Asiento[] disponibles = new Asiento[index];
        index = 0;
        for( Asiento asiento : detectados ){
            if( asiento != null ){
                disponibles[index] = asiento;
                index++;            
            }            
        }
        return disponibles;
    }
    
    public Asiento[] getAsientos(){
        return asientos;
    }

    public Asiento[] buscaAsientosContiguos(int cantidad){
        return null;
    }
}
