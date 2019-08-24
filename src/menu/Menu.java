package menu;

import opciones.conversion.ConversionMonedas;
import opciones.salario.Salario;

import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;


import javax.swing.*;
import java.awt.*;



public class Menu extends Frame {
    protected JPanel menuprincipal;
    protected JButton menusalario;
    protected JButton menuconversion;
    protected JButton btnCerrarVentana;

    public Menu() {
    add(menuprincipal);
        setTitle(MENUPRINCIPAL.getMessage());
        setSize(QUINIENTOS.getValores(), SEISCIENTOS.getValores());


        menuconversion.addActionListener(e->{
            ConversionMonedas conversionMonedas = new ConversionMonedas();
            conversionMonedas.setVisible(true);
            esconderVentana();
        });
        menusalario.addActionListener(e->{
            Salario salario = new Salario();
            salario.setVisible(true);
            esconderVentana();
        });
        btnCerrarVentana.addActionListener(e->{
            JOptionPane.showMessageDialog(null,HASTAPRONTO.getMessage());
            System.exit(CERO.getValores());

        });
    }
    public void esconderVentana(){
        this.dispose();
    }
}
