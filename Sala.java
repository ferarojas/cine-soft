import java.util.ArrayList;

/**
 * Representa una sala con filas de asientos.
 * Las filas pueden tener cantidades diferentes de asientos.
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
     * @param cantidad de asientos de las filas.
     */
    public Sala(String nombreSala, int cantidadFilas, int cantidadAsientos){
        this.nombreSala = nombreSala;
        filas = new ArrayList<>();
        for( int i=0; i<cantidadFilas; i++ ){
            filas.add( new Fila(cantidadAsientos) );
        }        
    }
    
    /**
     * Cuando se desee agregar fila por fila para construir salas que tengan
     * filas con diferentes cantidades de asientos.
     * @param cantidad de asientos de la fila a agregar.
     */
    public void agregaFila(int cantidadAsientos){
        filas.add( new Fila(cantidadAsientos) );
    }

    public boolean aceptaReserva(int numeroDeFila, int[] numerosDeAsientos){
        if( numeroDeFila > 0 && numeroDeFila <= filas.size() ){
            numeroDeFila--;
            return filas.get(numeroDeFila).reservaAsientos(numerosDeAsientos);
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
