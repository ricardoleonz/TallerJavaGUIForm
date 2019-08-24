package opciones.conversion;

import clases.conversionmonedas.ConversionMonedasLogica;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;


public class Dolar extends Frame {


        private static ConversionMonedasLogica conversionMonedasLogica = new ConversionMonedasLogica();


    protected JPanel dolarform;
    protected JTextField txtDolar;
    protected JLabel lblDolarEuro;
    protected JLabel lblDolarYen;
    protected JLabel lblIngresarDolar;
    protected JButton btnSalirConversion;
    private JButton btnConvertirDolar;
    private JLabel lblresultadoPesos;

    public Dolar(){
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        add(dolarform);
        setTitle(DOLAR.getMessage());
        setSize(QUINIENTOS.getValores(), CUATROCIENTOS.getValores());


        btnSalirConversion.addActionListener(e->{
            ConversionMonedas conversionMonedas = new ConversionMonedas();
            conversionMonedas.setVisible(true);
            esconderVentana();
        });


        btnConvertirDolar.addActionListener(e->{

                datos(txtDolar.getText());
                lblDolarEuro.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirDolarEuro())));
                lblDolarYen.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirDolarYen())));
                lblresultadoPesos.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirDolarPesos())));

        });
    }

    public void esconderVentana(){
        this.dispose();
    }

    public void datos(String valor1){
        conversionMonedasLogica.setDolar(Double.parseDouble(valor1));
        lblDolarEuro.setVisible(true);
        lblDolarYen.setVisible(true);
        lblresultadoPesos.setVisible(true);
    }

}
