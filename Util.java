/**
 * Ofrece metodos utiles para las demas clases.
 * 
 * @author  FRoM
 * @version 2021
 */
public class Util
{
    private static Cliente cliente1;

    /**
     * Provee un cliente para probar metodos de otras clases.
     */
    public static Cliente getCliente(){
        cliente1 = new Cliente("pedro", "123");
        return cliente1;
    }
}
