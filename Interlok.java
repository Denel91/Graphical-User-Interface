package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interlok extends JFrame implements ActionListener {
    public static final int LARGHEZZA = 460;
    public static final int ALTEZZA = 400;
    public static final int RIGHE = 25;
    public static final int CARATTERI_PER_RIGA = 40;
    public JTextField operando1, operando2;

    public JTextArea testo;
    private String primoOperando = "Ancora nessun testo";
    private String secondoOperando = "Ancora nessun testo";

    public Interlok() {
        super();
        setSize(LARGHEZZA, ALTEZZA);
        addWindowListener(new DistruttoreFinestra());
        setTitle("Concatena");
        setLayout(new BorderLayout());

        //Pannello Operandi
        JPanel pannelloOperandi = new JPanel();
        pannelloOperandi.setBackground(Color.LIGHT_GRAY);
        pannelloOperandi.setLayout(new FlowLayout());

        //Primo Text Fiel del primo operando
        operando1 = new JTextField(15);
        pannelloOperandi.add(operando1);

        //Bottone
        JButton pulsanteAddizione = new JButton("+");
        pulsanteAddizione.addActionListener(this);
        pannelloOperandi.add(pulsanteAddizione);

        //Secondo Text Field del secondo operando
        operando2 = new JTextField(15);
        pannelloOperandi.add(operando2);

        add(pannelloOperandi, BorderLayout.SOUTH);

        //Pannello principale della finestra
        JPanel pannelloTesto = new JPanel();
        pannelloTesto.setBackground(Color.GRAY);

        //Nome della'area di testo
        testo = new JTextArea(RIGHE, CARATTERI_PER_RIGA);
        testo.setBackground(Color.WHITE);
        pannelloTesto.add(testo);

        add(pannelloTesto, BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getActionCommand().equals("+")) {
                primoOperando = operando1.getText();
                secondoOperando = operando2.getText();
                testo.append(primoOperando + " + " + secondoOperando + " = " + (primoOperando + secondoOperando) + "\n");
            }
        } catch (Exception err) {
            System.out.println("Mona, serve uno String!");
        }
    }

    public static void main(String[] args) {
        Interlok lok = new Interlok();
        lok.setVisible(true);

    }
}
