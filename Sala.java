import java.util.ArrayList;

/**
 * Representa una sala con filas de asientos.
 * Las filas pueden tener cantidades diferentes de asientos.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Sala {

    private ArrayList<Fila> filas;
    private String nombreSala;

    /**
     * Crea una sala con cierta cantidad de filas; todas con la misma cantidad
     * de asientos. Si esto no es lo requerido, cree una sala con una primera
     * fila y utilice el metodo agregaFila, para agregar mas filas con diferente
     * cantidad de asientos para cada fila.
     * 
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
    
    public Fila getFila(int index){
        return filas.get(index);
    }

    public ArrayList<Fila> getFilas(){
        return filas;
    }
}
