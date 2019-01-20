package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Una semplice classe finestra.
 */
public class PrimaFinestra extends JFrame {
    public static final int LARGHEZZA = 300;
    public static final int ALTEZZA = 200;

    public PrimaFinestra() {
        super();

        setSize(LARGHEZZA, ALTEZZA);
        JLabel etichetta = new JLabel("Non premere quel pulsante!");
        add(etichetta);

        DistruttoreFinestra ascoltatore = new DistruttoreFinestra();
        addWindowListener(ascoltatore);
    }
}
