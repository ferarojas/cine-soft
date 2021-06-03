
/**
 * Representa una sala con filas de asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Sala {

    private Fila[] filas;
    private String nombreSala;

    public Sala(String nombreSala, int cantidad){
        this.nombreSala = nombreSala;
        filas = new Fila[cantidad];
    }
    
    public boolean aceptaReserva(Fila filaElegida, int[] numerosElegidos ){
        return false;
    }

    public Fila[] buscaAsientosContiguos(Fila filaElegida){
        return null;
    }
    
    public String getDetalles(){
        return "";
    }
    
    public void agregaFila(Fila fila)
    {
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public Fila[] getFilas(){
        return filas;
    }
}
