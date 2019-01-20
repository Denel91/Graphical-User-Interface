package GUI;
import java.awt.Color;

public class SecondaFinestraDemo {
    /**
     * Crea e visualizza due finestre della classe SecondaFinestra.
     */
    public static void main(String args[]) {
        SecondaFinestra finestra1 = new SecondaFinestra();
        finestra1.setVisible(true);

        SecondaFinestra finestra2 = new SecondaFinestra(Color.PINK);
        finestra2.setVisible(true);
    }
}
