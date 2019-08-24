package clases.constantes.dobles;

public enum Dobles {
    CERO_NUEVE(0.90135),
    CIEN_SEIS(106.38),
    UNO_DIEZ(1.1094),
    UNO_DIESCIOCHO(118.02),
    CERO_NUEVE_CUATRO(0.0094),
    CERO_OCHO_CUATRO(0.00847),
    DIEZPORCIENTO(1.10),
    QUINCEPORCIENTO(1.15);

    private double valor;

    Dobles(double d) {
        this.valor = d;
    }

    public double getValor() {
        return valor;
    }
}
