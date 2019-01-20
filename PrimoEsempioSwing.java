package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimoEsempioSwing {
    public static final int LARGHEZZA = 400;
    public static final int ALTEZZA = 200;

    public static void main(String args[]) {
        JFrame finestra = new JFrame();
        finestra.setSize(LARGHEZZA, ALTEZZA);

        JLabel etichetta = new JLabel("Non premere quel pulsante!");
        finestra.add(etichetta);

        DistruttoreFinestra ascoltatore = new DistruttoreFinestra();
        finestra.addWindowListener(ascoltatore);
        finestra.setVisible(true);
    }
}
