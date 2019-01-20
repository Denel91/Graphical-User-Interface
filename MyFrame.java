package GUI;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    private Choice c = new Choice();
    private Panel p1 = new Panel();
    private Panel p2 = new Panel();
    private TextArea t = new TextArea(10,20 );
    private Button b = new Button("Ripeti");
    private TextField f = new TextField();

    public MyFrame() {
        super("MioFrame");
        p1.add(f);
        p1.add(c);
        this.add(p1, "North");
        this.add(t, "Center");
        p2.add(b);
        this.add(p2, "South");
        c.add("*");
        c.add("#");
        this.setVisible(true);
        this.pack();

        AscoltaScelta listener = new AscoltaScelta(c,t); //Riceve due parametri di tipo Choice e TextArea
        c.addItemListener(listener);

        AscoltaPulsante ascoltatore = new AscoltaPulsante();
        b.addActionListener(ascoltatore);
    }

    public static void main(String[] args) {

        new MyFrame();
    }

    public class AscoltaPulsante implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand().equals("Ripeti")) {
                int n = Integer.parseInt(f.getText());
                for(int i = 1; i <= n; i++) {
                    t.append(t.getText());
                }
            }

        }
    }

}
