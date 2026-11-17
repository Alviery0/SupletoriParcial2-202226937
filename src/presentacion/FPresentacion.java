package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPresentacion extends JFrame implements ActionListener {

    private Parcial parcial = new Parcial();
    private JLabel lResultado = new JLabel("", SwingConstants.CENTER);
    private JTextField tBase = new JTextField();
    private JTextField tExponente = new JTextField();
    private JButton bCalcular = new JButton("Calcular");

    public FPresentacion() {
        setTitle("supletorio parcial 2");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        tBase.setHorizontalAlignment(SwingConstants.CENTER);
        tExponente.setHorizontalAlignment(SwingConstants.CENTER);

        add(lResultado);
        add(new JLabel("Base:", SwingConstants.CENTER));
        add(tBase);
        add(new JLabel("Exponente:", SwingConstants.CENTER));
        add(tExponente);
        add(bCalcular);

        bCalcular.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int base = Integer.parseInt(tBase.getText());
            int exponente = Integer.parseInt(tExponente.getText());
            lResultado.setText("" + parcial.potencia(base, exponente));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Escriba solo numeros enteros");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new FPresentacion();
    }
}