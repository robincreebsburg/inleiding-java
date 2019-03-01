package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht8 extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    double getal1;
    double getal2;
    double uitkomst;

    @Override
    public void init() {
      tekstvak1 = new TextField(15);
      tekstvak2 = new TextField(15);
      keer = new Button("*");
      delen = new Button("/");
      plus = new Button("+");
      min = new Button("-");
      add(tekstvak1);
      add(tekstvak2);
      add(keer);
      add(delen);
      add(plus);
      add(min);

      KeerListener k = new KeerListener();
      keer.addActionListener(k);

      DelenListener d = new DelenListener();
      delen.addActionListener(d);

      PlusListener p = new PlusListener();
      plus.addActionListener(p);

      MinListener m = new MinListener();
      min.addActionListener(m);


    }

    @Override
    public void paint(Graphics g) {

    }

    class KeerListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String r = tekstvak1.getText();
            getal1 = Double.parseDouble(r);
            String c = tekstvak2.getText();
            getal2 = Double.parseDouble(c);
            uitkomst = getal1 * getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");

        }
    }

    class DelenListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String r = tekstvak1.getText();
            getal1 = Double.parseDouble(r);
            String c = tekstvak2.getText();
            getal2 = Double.parseDouble(c);
            uitkomst = getal1 / getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class PlusListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String r = tekstvak1.getText();
            getal1 = Double.parseDouble(r);
            String c = tekstvak2.getText();
            getal2 = Double.parseDouble(c);
            uitkomst = getal1 + getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class MinListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String r = tekstvak1.getText();
            getal1 = Double.parseDouble(r);
            String c = tekstvak2.getText();
            getal2 = Double.parseDouble(c);
            uitkomst = getal1 - getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
}
