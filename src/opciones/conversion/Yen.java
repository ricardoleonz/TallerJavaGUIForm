package opciones.conversion;

import clases.conversionmonedas.ConversionMonedasLogica;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;

public class Yen extends Frame {
    private static ConversionMonedasLogica conversionMonedasLogica = new ConversionMonedasLogica();

    protected JPanel yenform;
    protected JLabel lblConversionYen;
    protected JTextField txtYen;
    protected JButton btnConvertirYen;
    protected JButton btnSalirY;
    protected JLabel lblIngresarYen;
    protected JLabel lblYenDolar;
    protected JLabel lblYenEuro;
    private JLabel lblYenPesos;

    public Yen() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        add(yenform);
        setTitle(YEN.getMessage());
        setSize(QUINIENTOS.getValores(), CUATROCIENTOS.getValores());

        btnSalirY.addActionListener(e->{
            ConversionMonedas conversionMonedas = new ConversionMonedas();
            conversionMonedas.setVisible(true);
            esconderVentana();
        });


        btnConvertirYen.addActionListener(e->{
            datos(txtYen.getText());
            lblYenDolar.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirYenDolar())));
            lblYenEuro.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirYenEuro())));
            lblYenPesos.setText(String.valueOf(formateador.format(conversionMonedasLogica.convertirYenPesos())));
        });
    }
    public void esconderVentana(){
        this.dispose();
    }

    public void datos(String valor1){
        conversionMonedasLogica.setYen(Double.parseDouble(valor1));
        lblYenDolar.setVisible(true);
        lblYenEuro.setVisible(true);
        lblYenPesos.setVisible(true);
    }
}
