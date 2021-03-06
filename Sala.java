import java.util.ArrayList;

/**
 * Representa una sala con filas de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Sala {

    private ArrayList<Fila> filas;
    private String nombreSala;

    /**
     * @param nombre de la sala.
     * @param cantidad de filas de esta sala.
     * @param cantidad de asientos de cada fila.
     */
    public Sala(String nombreSala, int cantidadFilas, int cantidadAsientos){
        this.nombreSala = nombreSala;
        filas = new ArrayList<>();
        for( int i=0; i<cantidadFilas; i++ ){
            filas.add( new Fila(cantidadAsientos));
        }        
    }

    public boolean aceptaReserva(int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){
        if( numeroDeFila > 0 && numeroDeFila <= filas.size() ){
            numeroDeFila--;
            return filas.get(numeroDeFila).reservaAsientos(numerosDeAsientos, cliente);
        }
        else
            return false;
    }

    public Fila[] buscaAsientosContiguos(Fila filaElegida){
        return null;
    }

    public String getDetalles(){
        return nombreSala +" - # de filas: "+ filas.size();
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public ArrayList<Fila> getFilas(){
        return filas;
    }
}
