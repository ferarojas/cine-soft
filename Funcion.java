import java.util.ArrayList;

/**
 * Representa una funcion: pelicula, sala y hora de proyeccion.
 * Mantiene una coleccion de los clientes que han reservado asientos.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Funcion {

    private Sala sala; 
    private String pelicula;
    private int dia;
    private String hora;
    private ArrayList<Cliente> clientes;

    public Funcion(Sala sala, String pelicula, int dia, String hora) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.dia = dia;
        this.hora = hora;
        clientes = new ArrayList<>();
    }

    public boolean reservaAsientos(Cliente cliente, int cantidad){
        return false;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public String getDetalles()
    {
        return pelicula +"\n"+ sala +" - "+ dia +" - "+ hora;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String gethora() {
        return hora;
    }

    public void sethora(String hora) {
        this.hora = hora;
    }

    public String getpelicula() {
        return pelicula;
    }

    public void setpelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}

