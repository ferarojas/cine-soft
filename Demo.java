import java.util.ArrayList;
import java.util.Scanner;
/**
 * Demo realiza demostracion de la funcionalidad de todas las clases
 * del proyecto.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Demo
{
    private SistemaDeReserva sistemaD1;
    private ArrayList<Funcion> funciones;
    private Scanner lector;

    public Demo(){
        Fabrica.fabricaEscenario();
        sistemaD1 = Fabrica.getSistemaDeReserva();
        funciones = sistemaD1.getFunciones();
        lector = new Scanner(System.in);
        play();
    }

    public void play(){
        bienvenida();
        makeMenu();
        boolean termina = false;
        while (! termina) {
            System.out.print("Tu opcion? ");
            int opcion = getOpcion();
            termina = procesaOpcion(opcion);
        }        
        despedida();
    }

    private int getOpcion(){
        int opcion = lector.nextInt();

        if(opcion<0 || opcion > 6) {
            System.out.println("No es una opcion valida...");
            return 7;   // regresa al menu
        }
        return opcion;
    }

    private void muestraFunciones(){
        int index = 1;
        for( Funcion funcion : funciones ){
            System.out.println( index +"> "+ funcion.getDetalles() );
            index++;
        }
    }
    
    private Funcion getFuncion(){
        System.out.print("Funcion? ");
        int indexFuncion = lector.nextInt();
        indexFuncion--;
        return funciones.get(indexFuncion);
    }

    private void reservaAsientos(){
        Funcion funcion = getFuncion();
        Sala sala = funcion.getSala();
        ArrayList<Fila> filas = sala.getFilas();
        int indexFila = 1;
        System.out.println("Asientos disponibles" );        
        for(Fila fila : filas ){
            Asiento[] disponibles = fila.asientosDisponibles();
            System.out.println("Fila "+ indexFila );
            indexFila++;
            for( Asiento asiento : disponibles ){
                if( asiento.estaDisponible() ){
                    System.out.print(" #" + asiento.getNumero());
                }
            }
            System.out.println();
        }
        System.out.print("Cuantos asientos? ");
        int cantidad = lector.nextInt();
        System.out.print("Fila? ");
        int numeroDeFila = lector.nextInt();
        int[] nAsiento = new int[cantidad];
        for(int i=0; i<cantidad; i++){
            System.out.print("# de asiento? ");
            nAsiento[i] = lector.nextInt();
        }
        Cliente cliente = getCliente();
        sistemaD1.reservaAsientos(funcion, numeroDeFila, nAsiento, cliente);        
    }
    
    public Cliente getCliente(){
        System.out.print("Su nombre? ");
        String nombre = lector.next();
        System.out.print("Su telefono? ");
        String telefono = lector.next();
        Cliente cliente = new Cliente(nombre, telefono);
        return cliente;
    }

    private void consultaReserva(){
        System.out.print("Su nombre? ");
        String nombre = lector.next();
        System.out.println(sistemaD1.getDetallesReserva(getFuncion(), nombre));
    }

    private void cancelaReserva(){
        ;
    }

    private void funcionesXtitulo(){
        ;         
    }

    private void funcionesXFecha(){
        ;
    }

    private boolean procesaOpcion(int opcion){

        switch( opcion ) {
            case 0:
            return true;
            case 1:
            System.out.println("1. Funciones");
            muestraFunciones();
            break;
            case 2:
            System.out.println("2. Reservar asientos");
            reservaAsientos();
            break;
            case 3:
            System.out.println("3. Consultar reserva");   
            consultaReserva();
            break;
            case 4:
            System.out.println("4. Cancelar reserva");
            cancelaReserva();
            break;
            case 5:
            System.out.println("5. Funciones por Titulo");   
            funcionesXtitulo();
            break;
            case 6:
            System.out.println("6. Funciones por Fecha");
            funcionesXFecha();
            break;
            case 7:
            System.out.println("\f");
            makeMenu();
            break;
        }
        return false;
    }

    private void makeMenu(){
        System.out.println("Cine-Soft - MENU PRINCIPAL" );
        System.out.println("1. Todas las Funciones");
        System.out.println("2. Reservar asientos");
        System.out.println("3. Consultar reserva");
        System.out.println("4. Cancelar reserva");
        //         System.out.println("5. Funciones por Titulo"); 
        //         System.out.println("6. Funciones por Fecha");
        //         System.out.println("7. Regresar a este menu");        
        System.out.println("0. Terminar");        
    }

    private void bienvenida(){
        System.out.println();
        System.out.println("Bienvenido a Reservas en Cine-Soft");
        System.out.println("apps-FRoM-2021.");
        System.out.println();
    }

    private void despedida(){
        System.out.println("Gracias por preferirnos.  Hasta la vuelta!");
    }
}
