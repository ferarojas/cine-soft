/**
 * Representa a quien reserva asientos en una funcion.
 * 
 * @author  FRoM
 * @version 2018
 */
public class Cliente {
    
    private String nombre;
    private String telefono;
    private String eMail;
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void setEmail(String eMail)
    {
       this.eMail = eMail;
    }
    
    public String toString()
    {
        return nombre +" - "+ telefono +" - "+ eMail;
    }
}
