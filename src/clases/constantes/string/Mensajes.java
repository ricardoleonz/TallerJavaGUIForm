package clases.constantes.string;

public enum Mensajes {
    VACIO(""),
    MENUPRINCIPAL("Menu Principal"),
    HASTAPRONTO("Hasta pronto!!!!!"),
    CALCULOSALARIO("Cálculos de salarios"),
    YEN("Yen"),
    EURO("Euro"),
    DOLAR("Dolar"),
    OPCIONESCONVERSION("Opción de Conversión de Monedas");

    private String message;

    Mensajes(String s){
        this.message = s;
    }

    public String getMessage() {
        return message;
    }
}
