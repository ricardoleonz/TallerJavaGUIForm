package clases.conversionmonedas;

import static clases.constantes.enteros.Enteros.*;

public class ConversionMonedas {

    private double dolar;
    private double euro;
    private double yen;




    public ConversionMonedas(){
        this.dolar = CERO.getValores();
        this.euro =CERO.getValores();
        this.yen = CERO.getValores();

    }


    public double getEuro() {
        return euro;
    }

    public double getYen() {
        return yen;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }
}
