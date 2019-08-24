package clases.salarioclase;
import static clases.constantes.enteros.Enteros.*;
import static clases.constantes.dobles.Dobles.*;

public class SalarioLogica extends SalarioCodigo {

    public String nombreTrabajador() {
        return (this.getNombre());
    }

    public String diaTrabajado() {
        return (this.getDia());
    }

    public double horasTrabajadas() {
        return (this.getHoras());
    }
    public double jornalDiurno() {
        return (this.horasTrabajadas()*TREINTAYCINCOMIL.getValores());
    }

    public double jornalNocturno() {
        return (this.horasTrabajadas()*CINCUENTAMIL.getValores());
    }
    public double jornalDiurnoFestivo() {
        return (this.horasTrabajadas()*TREINTAYCINCOMIL.getValores()*DIEZPORCIENTO.getValor());
    }

    public double jornalNocturnoFestivo() {
        return (this.horasTrabajadas()*CINCUENTAMIL.getValores()*QUINCEPORCIENTO.getValor());
    }
}



