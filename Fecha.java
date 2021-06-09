import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
/**
 * Fecha 
 * 
 * @author  FRoM 
 * @version 2013
 */
public class Fecha
{
    private Calendar calendario; 

    private int agnio;
    private int mes;
    private int dia;    
    private int hora;
    private int minuto;
    private int segundo;
    private String strAgnio;
    private String strMes;
    private String strDia;    
    private String strHora, strAM_PM;    
    private String strMinuto;    
    private String strSegundo;

    private String meses[] = { "Enero", "Febrero", "Marzo", "Abril", 
            "Mayo", "Junio", "Julio", "Agosto", 
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    private String dias[] = { "", "Domingo", "Lunes", "Martes", "Miércoles", 
                                "Jueves", "Viernes", "Sábado" };

    public Fecha()
    {
        if( calendario == null )
            calendario = new GregorianCalendar();
    }
    
    public String getStringFecha(){
        return getStrDia() +", "+ getDiaDelMes() +" de "+ getStrMes() +" de "+ getAgnio();
    }
    
    public String getStringHora(){
        return getHora() +":"+ getMinuto() +" "+ getAM_PM();
    }

    public int getAgnio()
    {
        return calendario.get( Calendar.YEAR );
    }

    public int getMes()
    {        
        return calendario.get( Calendar.MONTH );
    }

    public int getDiaDelMes()
    {
        return calendario.get( Calendar.DAY_OF_MONTH );
    }

    public int getDiaSemana()
    {
        return calendario.get( Calendar.DAY_OF_WEEK );
    }

    public int getHoraDelDia()
    {
        return calendario.get( Calendar.HOUR_OF_DAY );
    }    

    public int getHora()
    {
        return calendario.get( Calendar.HOUR );
    }

    public int getMinuto()
    {
        return calendario.get( Calendar.MINUTE );
    }

    public int getSegundo()
    {
        return calendario.get( Calendar.SECOND );
    }        

    // Entrega el número de año como cadena
    public String getStrAgnio()
    {
        strAgnio = "" + getAgnio();
        return strAgnio;
    }

    // Entrega el nombre del mes
    public String getStrMes()
    {
        strMes = meses[ calendario.get( Calendar.MONTH ) ];
        return strMes;
    }

    // Entrega el nombre del día
    public String getStrDia()
    {
        strDia = "" + dias[ calendario.get( Calendar.DAY_OF_WEEK ) ];
        return strDia;
    }

    // Entrega String del ordinal del día
    public String getStrDiaDeLaSemana()
    {
        strDia = "" + calendario.get( Calendar.DAY_OF_WEEK );
        return strDia;
    }

    public String getStrDiaDelMes()
    {
        strDia = "" + calendario.get( Calendar.DAY_OF_MONTH );
        return strDia;
    }
    // entrega la hora del día como cadena
    public String getStrHoraDelDia()
    {
        strHora = getHoraDelDia() + " " + getAM_PM(); 
        return strHora;
    }

    public String getStrHora()
    {
        strHora = getHora() + " "; 
        return strHora;
    }

    public String getAM_PM()
    {
        if( calendario.get( Calendar.AM_PM ) == 0 )
            strAM_PM = "AM";
        else
            strAM_PM = "PM";
            
        return strAM_PM;
    }

    public String getStrMinuto()
    {
        if( getMinuto() < 10 )
            strMinuto = "0" + getMinuto();
        else
            strMinuto = "" + getMinuto();
        return strMinuto;
    }

    public String getStrSegundo()
    {
        if( getSegundo() < 10 )
            strSegundo = "0" + getSegundo();
        else
            strSegundo = "" + getSegundo();
        return strSegundo;
    }    
}