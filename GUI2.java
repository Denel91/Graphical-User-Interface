package GUI;

import java.awt.*;

public class GUI2 extends Frame {
    TextField t = new TextField(10);
    Label la = new Label("Massimo = ");
    Label lb = new Label(" 0 ");

    public GUI2() {
        super("Massimo");
        Panel p2 = new Panel();
        p2.add(la);
        p2.add(lb);
        add(t);
        add(p2, BorderLayout.NORTH);
        t.addActionListener(new Ascoltatore(t, lb));
        t.addKeyListener(new KeyAscoltatore(t, lb));
        addWindowListener(new DistruttoreFinestra());
        setVisible(true);
        pack();
    }

    public static void main(String[] args){
        GUI2 personalGui = new GUI2();
    }
}
