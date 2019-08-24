package opciones.salario;

import clases.salarioclase.SalarioLogica;
import menu.Menu;

import static clases.constantes.string.Mensajes.*;
import static clases.constantes.enteros.Enteros.*;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class Salario extends Frame {
    private static SalarioLogica salarioLogica = new SalarioLogica();
    protected JPanel salarioform;
    protected JTextField txtNombre;
    protected JTextField txtDia;
    protected JTextField txtTurno;
    protected JTextField txtHoras;
    protected JButton btnSalirSalario;
    protected JTextField txtFestivo;
    protected JButton btnCalcular;
    protected JLabel lblResultado;
    protected JRadioButton rdbDiurno;
    protected JRadioButton rdbNocturno;
    protected JRadioButton rdbFestivo;
    protected JRadioButton rdbLaboral;
    protected JLabel lblResultadoNombre;
    protected JLabel lblResultadoDia;
    protected JLabel lblResultadoHoras;

    public Salario() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbNocturno);
        buttonGroup.add(rdbDiurno);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rdbFestivo);
        buttonGroup1.add(rdbLaboral);

        add(salarioform);
        setTitle(CALCULOSALARIO.getMessage());
        setSize(QUINIENTOS.getValores(), CUATROCIENTOS.getValores());


        btnSalirSalario.addActionListener(e -> {
            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });


        btnCalcular.addActionListener(e -> {


            if (rdbDiurno.isSelected() && rdbFestivo.isSelected()) {

                datos(txtNombre.getText(), txtDia.getText(), txtHoras.getText());
                lblResultado.setText(String.valueOf(formateador.format(salarioLogica.jornalDiurnoFestivo())));
            }
            if (rdbNocturno.isSelected() && rdbFestivo.isSelected()) {

                datos(txtNombre.getText(), txtDia.getText(), txtHoras.getText());
                lblResultado.setText(String.valueOf(formateador.format(salarioLogica.jornalNocturnoFestivo())));
            }
            if (rdbDiurno.isSelected() && rdbLaboral.isSelected()) {

                datos(txtNombre.getText(), txtDia.getText(), txtHoras.getText());
                lblResultado.setText(String.valueOf(formateador.format(salarioLogica.jornalDiurno())));
            }
            if (rdbNocturno.isSelected() && rdbLaboral.isSelected()) {

                datos(txtNombre.getText(), txtDia.getText(), txtHoras.getText());
                lblResultado.setText(String.valueOf(formateador.format(salarioLogica.jornalNocturno())));
            }

        });
    }

    public void esconderVentana() {

        this.dispose();
    }

    public void datos(String nombre, String dia, String hora) {
        salarioLogica.setNombre(nombre);
        salarioLogica.setDia(dia);
        salarioLogica.setHoras(Double.parseDouble(hora));
        lblResultado.setVisible(true);
        lblResultadoNombre.setVisible(true);
        lblResultadoNombre.setText(salarioLogica.nombreTrabajador());
        lblResultadoDia.setVisible(true);
        lblResultadoDia.setText(salarioLogica.diaTrabajado());
        lblResultadoHoras.setVisible(true);
        lblResultadoHoras.setText(String.valueOf(salarioLogica.horasTrabajadas()));


    }
}
