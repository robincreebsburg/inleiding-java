package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    double getal;
    double getal2;
    double BTW;

    @Override
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label();
        knop = new Button("Ok");
        BTW = 0.21;
        KnopListener Ok = new KnopListener();
        knop.addActionListener(Ok);
        add(tekstvak);
        add(label);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("De prijs inclusief BTW: " + getal2, 50, 80 );
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s) * BTW;
            getal2 = Double.parseDouble(tekstvak.getText()) + getal;
            repaint();
        }
    }
}
