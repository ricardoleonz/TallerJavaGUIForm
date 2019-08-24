package opciones.conversion;

import menu.Menu;

import javax.swing.*;
import java.awt.*;
import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;


public class ConversionMonedas extends Frame {
    protected JPanel conversionform;
    protected JLabel lblOpcionConversion;
    protected JButton menuDolares;
    protected JButton menuYen;
    protected JButton menuEuro;
    protected JButton btnSalirConversion;

    public ConversionMonedas(){
        add(conversionform);
        setTitle(OPCIONESCONVERSION.getMessage());
        setSize(QUINIENTOS.getValores(),CUATROCIENTOS.getValores());


        btnSalirConversion.addActionListener(e->{
            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
        menuDolares.addActionListener(e->{
            Dolar dolar = new Dolar();
            dolar.setVisible(true);
            esconderVentana();
        });
        menuEuro.addActionListener(e->{
            Euro euro = new Euro();
            euro.setVisible(true);
            esconderVentana();
        });
        menuYen.addActionListener(e->{
            Yen yen = new Yen();
            yen.setVisible(true);
            esconderVentana();
        });
    }

    public void esconderVentana(){
        this.dispose();
    }
}
