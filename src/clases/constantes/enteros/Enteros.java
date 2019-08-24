package clases.constantes.enteros;

public enum Enteros {
    CERO(0),
    CUATROCIENTOS(400),
    QUINIENTOS(500),
    SEISCIENTOS(600),
    TREINTAYCINCOMIL(35000),
    CINCUENTAMIL(50000),
    TRESMILQUINIENTOS(3500),
    TRESMIL(3000),
    MILQUINIENTOS(1500);


    private int valores;

    Enteros(int i) {
        this.valores = i;
    }

    public int getValores() {
        return valores;
    }
}
