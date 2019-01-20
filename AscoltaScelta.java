package GUI;
import java.awt.*;
import java.awt.event.*;

public class AscoltaScelta implements ItemListener {
    private Choice choice;
    private TextArea text;

    public AscoltaScelta(Choice choice, TextArea text) {
        this.choice = choice;
        this.text = text;
    }

    public void itemStateChanged(ItemEvent e) {
        text.append(choice.getSelectedItem() + "\n");

    }
}
