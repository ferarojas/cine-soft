
/**
 * Representa una sala con filas de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Sala {

    private Fila[] filas;
    private String nombreSala;

    /**
     * @param nombre de la sala.
     * @param cantidad de filas de esta sala.
     */
    public Sala(String nombreSala, int cantidad){
        this.nombreSala = nombreSala;
        filas = new Fila[cantidad];
        for( int i=0; i<cantidad; i++ ){
            filas[i] = new Fila(i+1);
        }        
    }

    public boolean aceptaReserva(int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){
        if( numeroDeFila >= 0 && numeroDeFila < filas.length )
            return filas[numeroDeFila].reservaAsientos(numerosDeAsientos, cliente);
        else
            return false;
    }

    public Fila[] buscaAsientosContiguos(Fila filaElegida){
        return null;
    }

    public String getDetalles(){
        return nombreSala +" - # de filas: "+ filas.length;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public Fila[] getFilas(){
        return filas;
    }
}
