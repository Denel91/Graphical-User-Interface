package GUI;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAscoltatore implements KeyListener {
    private TextField t;
    private Label lb;

    public KeyAscoltatore(TextField t, Label lb) {
        this.t = t;
        this.lb = lb;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            try {
                int n = Integer.parseInt(t.getText());
                lb.setText(Integer.toString(n));

            } catch (Exception err) {
                System.out.println("Errore nell'interfaccia");

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
