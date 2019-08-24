package clases.conversionmonedas;
import static clases.constantes.dobles.Dobles.*;

public class ConversionMonedasLogica extends ConversionMonedas {

    public double convertirDolarEuro() {
        return (this.getDolar() * CERO_NUEVE.getValor());
    }

    public double convertirDolarYen() {
        return (this.getDolar() * CIEN_SEIS.getValor());
    }

    public double convertirEuroDolar() {
        return (this.getEuro() * UNO_DIEZ.getValor());
    }

    public double convertirEuroYen() {
        return (this.getEuro() * UNO_DIESCIOCHO.getValor());
    }

    public double convertirYenDolar() {
        return (this.getYen() * CERO_NUEVE_CUATRO.getValor());
    }

    public double convertirYenEuro() {
        return (this.getYen()*CERO_OCHO_CUATRO.getValor());
    }


}
