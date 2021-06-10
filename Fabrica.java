import java.util.Scanner;
/**
 * Fabrica crea objetos para el Demo y la simulacion de la app.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Fabrica
{
    private static SistemaDeReserva sistemaD1;
    private static Sala sala1;
    private static Sala sala2;    
    private static Funcion funcion1;    
    private static Funcion funcion2;
    private static Funcion funcion3;
    private static Scanner lector;
    
    public static void fabricaEscenario(){
        sistemaD1 = new SistemaDeReserva();
        sala1 = new Sala("lac", 12, 14);
        sala2 = new Sala("zalamea", 8, 10);        
        funcion1 = new Funcion(sala1, "behind", new Fecha(2021,4,14,18,30));
        funcion2 = new Funcion(sala1, "behind", new Fecha(2021,4,14,20,30));
        funcion3 = new Funcion(sala2, "cars", new Fecha(2021,4,15,10,30));
        sistemaD1.agregaFuncion(funcion1);
        sistemaD1.agregaFuncion(funcion2);
        sistemaD1.agregaFuncion(funcion3);
        lector = new Scanner(System.in);        
    }

    public static SistemaDeReserva getSistemaDeReserva(){
        return sistemaD1;
    }
}

