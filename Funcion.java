import java.util.ArrayList;

/**
 * Representa una funcion: pelicula, sala y hora de proyeccion.
 * Mantiene una coleccion de los clientes que han reservado asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Funcion 
{
    private Sala sala; 
    private String pelicula;
    private Fecha fecha;
    private String hora;
    private ArrayList<Cliente> clientes;

    public Funcion(Sala sala, String pelicula, Fecha fecha) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.hora = hora;
        clientes = new ArrayList<>();
    }

    public boolean reservaAsientos(int numeroDeFila, int[] numerosDeAsientos){
        boolean seReservo = sala.aceptaReserva(numeroDeFila, numerosDeAsientos);
        if( seReservo == true ){
            Asiento[] reservados = sala.getFilas().get(numeroDeFila-1).asientosReservados();
            if( reservados.length > 0 ){
                for( Asiento asiento : reservados )
                    clientes.add(asiento.getCliente());
            }
        }
        return seReservo;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public String getDetalles()
    {
        return pelicula +"\nSala: "+ sala.getNombreSala() +" - "+ getFecha() +" - "+ gethora();
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public String getFecha() {        
        return fecha.getLaFecha();
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String gethora() {
        return fecha.getLaHora();
    }

    public void sethora(String hora) {
        this.hora = hora;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}

