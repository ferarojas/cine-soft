import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * FuncionGUI 
 * 
 * @author  FRoM
 * @version 0.1
 */
public class FuncionGUI extends JFrame
{
    private ArrayList<Funcion> funciones;
    private SistemaDeReserva sistemaD1;

    public FuncionGUI()
    {        
        Fabrica.fabricaEscenario();
        sistemaD1 = Fabrica.getSistemaDeReserva();
        funciones = sistemaD1.getFunciones();
        makeFrame();
    }

    private void getFunciones(){
        jbFunciones = new ArrayList<>();  

        for( Funcion funcion : funciones ){  
            JButton jbFuncion = new JButton(funcion.getDetalles());
            jbFuncion.setFont(new Font("Berlin Sans FB", 0, 18));
            jbFuncion.setVisible(true);
            jbFuncion.addActionListener( e -> reservaAsientos( funcion ) );
            jpFunciones.add(jbFuncion);           
        }
    }   

    /**
     * 
     */
    private void reservaAsientos(Funcion funcion){
        new SalaGUI(funcion);
    }

    public void makeFrame()
    {
        setTitle("Cine-Soft - FRoM" );
        Container contenido = getContentPane();                  
        jpFunciones = new JPanel();
        jpFunciones.setLayout(new GridLayout(0,1));

        jlTitulo = new JLabel("FUNCIONES");
        jlTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18));
        jlTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jlTitulo.setVisible(true);

        JPanel flow = new JPanel();
        getFunciones();         
        flow.add(jpFunciones);
        jspFunciones = new JScrollPane(jpFunciones); 
        jspFunciones.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        contenido.add(jlTitulo, BorderLayout.NORTH);
        contenido.add(jspFunciones, BorderLayout.CENTER);

        //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation( 100, 200 );
        setSize( ANCHO, ALTO );
        setVisible( true );
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {                    
                    new FuncionGUI(  );
                }
            });
    }

    private final int ANCHO = 400;
    private final int ALTO = 600;
    private JLabel jlTitulo;
    private List<JButton> jbFunciones; 
    private JPanel jpFunciones;
    private JScrollPane jspFunciones;
}
