import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * SalaGUI 
 * 
 * @author  FRoM
 * @version 0.1
 */
public class SalaGUI extends JFrame
{
    private Funcion funcionActual;
    private Sala salaActual;
    private ArrayList<Fila> filas;

    public SalaGUI(Funcion funcion)
    {
        funcionActual = funcion;
        salaActual = funcionActual.getSala();
        filas = salaActual.getFilas();
        makeFrame();
    }

    /**
     * Abre ventana de ruta con funcion elegida y datos de prueba
     * para fila y numeros de asientos seleccionados.
     */
    private void confirmar(){
        int[] numeroDeAsientos = {1,2,3};
        new ClienteGUI(funcionActual, 1, numeroDeAsientos);
    }    

    private void cancelar(){
        this.dispose();
    }                                      

    private void about(){
        JOptionPane.showMessageDialog( this, "Cine-Soft - FRoM\nVersion 1.0", "Acerca de...",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon("cine-soft.npg") );
    } 

    private ArrayList<JCheckBox> getAsientos(Fila fila){
        Asiento[] asientos = fila.getAsientos();
        ArrayList<JCheckBox> jchbAsientos = new ArrayList<>();
        for( Asiento asiento : asientos ){
            jchbAsientos.add( new JCheckBox() );
        }        
        return jchbAsientos;
    }

    public void makeFrame()
    {
        setTitle("CarPooling - FRoM");
        Container contenido = getContentPane();                  
        jpAsientos = new JPanel();
        jpAsientos.setLayout(new GridLayout(0,1));

        jtaFuncion = new JTextArea("FUNCION\n"+ funcionActual.getDetalles());
        jtaFuncion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18));
//         jtaFuncion.setHorizontalAlignment(SwingConstants.CENTER);
        jtaFuncion.setVisible(true);

        jpControles = new JPanel();
        jpControles.setBorder(BorderFactory.createEtchedBorder(1));
        jpControles.setVisible(true);

        jbConfirmar = new JButton("Confirmar");
        jbConfirmar.setFont(new Font("Berlin Sans FB", 0, 18));
        jbConfirmar.setVisible(true);        
        jbConfirmar.addActionListener( e -> confirmar() );

        jbCancelar = new JButton("Cancelar");
        jbCancelar.setFont(new Font("Berlin Sans FB", 0, 18));
        jbCancelar.setVisible(true);
        jbCancelar.addActionListener( e -> cancelar() );

        jbAbout = new JButton("About...");
        jbAbout.setFont(new Font("Berlin Sans FB", 0, 18));
        jbAbout.setVisible(true);        
        jbAbout.addActionListener( e -> about() );

        JPanel flow = new JPanel();
        for( Fila fila : filas ){
            ArrayList<JCheckBox> jchbAsientos = getAsientos(fila);
            JPanel jpFila = new JPanel();
            for( JCheckBox chb : jchbAsientos )
                jpFila.add( chb );
            jpAsientos.add(jpFila);
        }
        flow.add(jpAsientos);        
        jspAsientos = new JScrollPane(flow); 
        jspAsientos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jpControles.add(jbConfirmar);
        jpControles.add(jbCancelar);
        jpControles.add(jbAbout);

        contenido.add(jtaFuncion, BorderLayout.NORTH);
        contenido.add(jspAsientos, BorderLayout.CENTER);
        contenido.add(jpControles, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation( 100, 200 );
        setSize( ANCHO, ALTO );
        setVisible( true );
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {        
                    new SalaGUI( new Funcion(new Sala("lac", 12, 14), "behind", new Fecha(2021,4,14,18,30)) );
                }                
            });               
    }

    private final int ANCHO = 660;
    private final int ALTO = 540;
    private JButton jbConfirmar;
    private JButton jbCancelar;
    private JButton jbAbout;
    private JTextArea jtaFuncion;
    private JPanel jpControles;    
    private ArrayList<JCheckBox> jbAsientos; 
    private JPanel jpAsientos;
    private JScrollPane jspAsientos;    
}

