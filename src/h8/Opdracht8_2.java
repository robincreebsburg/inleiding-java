package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int M, V, ML, VL;

    @Override
    public void init() {
        knop1 = new Button("Mannen");
        Knop1Listener kl = new Knop1Listener();
        knop1.addActionListener(kl);
        knop2 = new Button("Vrouwen");
        Knop2Listener kl2 = new Knop2Listener();
        knop2.addActionListener(kl2);
        knop3 = new Button("Mannelijke leerlingen");
        Knop3Listener kl3 = new Knop3Listener();
        knop3.addActionListener(kl3);
        knop4 = new Button("Vrouwlijke leerlingen");
        Knop4Listener kl4 = new Knop4Listener();
        knop4.addActionListener(kl4);
        M = 0;
        V = 0;
        ML = 0;
        VL = 0;
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Zoveel mannen zijn er: " + M , 20,45);
        g.drawString("Zoveel vrouwen zijn er: " + V, 20,58);
        g.drawString("Zoveel mannelijke leerlingen zijn er: " + ML, 20,70);
        g.drawString("Zoveel vrouwlijke leerlingen zijn er  " + VL, 20,82);
    }

    class Knop1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            M++;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            V++;
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ML++;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            VL++;
            repaint();
        }
    }
}
