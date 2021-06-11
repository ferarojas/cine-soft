import java.util.ArrayList;

/**
 * Representa una funcion: pelicula, sala y hora de proyeccion.
 * Mantiene una coleccion de los clientes que han reservado asientos.
 * 
 * @author  FRoM
 * @version 2021
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

    public boolean reservaAsientos(int numeroDeFila, int[] numerosDeAsientos, Cliente cliente){
        boolean seReservo = sala.aceptaReserva(numeroDeFila, numerosDeAsientos, cliente);
        if( seReservo == true )
            clientes.add(cliente);        
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
        return pelicula +"\nSala: "+ sala.getNombreSala() +" - "+ fecha.getStringFecha() +" - "+ gethora();
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public Fecha getFecha() {        
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String gethora() {
        return fecha.getStringHora();
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}

