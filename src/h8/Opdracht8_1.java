package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8_1 extends Applet {
    TextField tekstvlak;
    Button knop;
    Button knop2;
    String text;

    public void init (){
        tekstvlak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());
        add(tekstvlak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g){
        g.drawString(text,70,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            text = tekstvlak.getText();
            repaint();
        }
    }

    public class Knop2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            repaint();
        }
    }



}
