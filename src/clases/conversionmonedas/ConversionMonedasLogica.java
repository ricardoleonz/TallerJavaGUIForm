package clases.conversionmonedas;
import static clases.constantes.dobles.Dobles.*;
import static clases.constantes.enteros.Enteros.*;

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

    public double convertirDolarPesos(){
        return (this.getDolar()*TRESMIL.getValores());
    }
    public double convertirEuroPesos() {
        return (this.getEuro()*TRESMILQUINIENTOS.getValores());
    }
    public double convertirYenPesos(){
        return (this.getYen()*MILQUINIENTOS.getValores());
    }



}
