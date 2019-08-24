package clases.salarioclase;
import static clases.constantes.enteros.Enteros.CERO;
import static clases.constantes.string.Mensajes.*;

public class SalarioCodigo {
    private String nombre;
    private String dia;
    private double horas;

    public SalarioCodigo(){
        this.nombre =VACIO.getMessage() ;
        this.dia=VACIO.getMessage();
        this.horas=CERO.getValores();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDia() {
        return dia;
    }

    public double getHoras() {
        return horas;
    }
}
