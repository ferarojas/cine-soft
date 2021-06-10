/**
 * Representa a quien reserva asientos en una funcion.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Cliente {

    private String nombre;
    private String telefono;
    private String eMail;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setEmail(String eMail)
    {
        this.eMail = eMail;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String toString()
    {
        return nombre +" - "+ telefono +" - "+ eMail;
    }
}
