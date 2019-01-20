package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private static final int LARGHEZZA = 460;
    private static final int ALTEZZA = 400;
    private JTextField text;
    private JButton pulsante1, pulsante2;

    public GUI() {
        super("Esercizio 5");
        setSize(LARGHEZZA, ALTEZZA);
        addWindowListener(new DistruttoreFinestra());
        setLayout(new BorderLayout());

        //Pannello JTextField
        JPanel field = new JPanel();
        field.setBackground(Color.DARK_GRAY);
        field.setLayout(new BorderLayout());

        text = new JTextField(8);
        field.add(text);
        add(field, BorderLayout.NORTH);

        //Pannello Operandi
        JPanel pannelloOperandi = new JPanel();
        pannelloOperandi.setBackground(Color.LIGHT_GRAY);
        pannelloOperandi.setLayout(new FlowLayout());

        pulsante1 = new JButton("B1");
        pulsante1.addActionListener(new Ascoltatore());
        pannelloOperandi.add(pulsante1);

        pulsante2 = new JButton("B2");
        pulsante2.addActionListener(new Ascoltatore());
        pannelloOperandi.add(pulsante2);

        add(pannelloOperandi, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        GUI myGUI = new GUI();
        myGUI.setVisible(true);
    }

    public class Ascoltatore implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("B1")) {
                pulsante2.setText(text.getText());
            } else if (e.getActionCommand().equals("B2")) {
                pulsante1.setText(text.getText());
            }
        }
    }
}
