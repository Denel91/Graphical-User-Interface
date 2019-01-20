package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ascoltatore implements ActionListener {
    private TextField t;
    private Label lb;

    public Ascoltatore(TextField t, Label lb){
        this.t = t;
        this.lb = lb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(t.getText());
            lb.setText(Integer.toString(n));

        } catch (Exception err) {
            System.out.println("Errore nell'interfaccia");

        }
    }
}
