package opciones.conversion;

import clases.conversionmonedas.ConversionMonedasLogica;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;


public class Euro extends Frame {
    private static ConversionMonedasLogica conversionMonedasLogica = new ConversionMonedasLogica();
    protected JPanel euroform;
    protected JButton btnConvertirEuro;
    protected JLabel lblConversionEuro;
    protected JLabel lblIngreseEuro;
    protected JTextField txtEuro;
    protected JButton btnVolverE;
    protected JLabel lblEuroDolar;
    protected JLabel lblEuroYen;
    private JLabel lblEuroPesos;

    public Euro(){
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        add(euroform);
        setTitle(EURO.getMessage());
        setSize(QUINIENTOS.getValores(), CUATROCIENTOS.getValores());


        btnVolverE.addActionListener(e->{
            ConversionMonedas conversionMonedas = new ConversionMonedas();
            conversionMonedas.setVisible(true);
            esconderVentana();
        });

        btnConvertirEuro.addActionListener(e->{
            datos(txtEuro.getText());
            lblEuroDolar.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirEuroDolar())));
            lblEuroYen.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirEuroYen())));
            lblEuroPesos.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirEuroPesos())));
        });
    }
    public void esconderVentana(){
        this.dispose();
    }
    public void datos(String valor1){
        conversionMonedasLogica.setEuro(Double.parseDouble(valor1));
        lblEuroDolar.setVisible(true);
        lblEuroYen.setVisible(true);
        lblEuroPesos.setVisible(true);
    }
}
