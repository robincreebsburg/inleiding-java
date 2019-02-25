package h6;

import java.applet.Applet;
import java.awt.*;

public class opdracht6_2 extends Applet {
    int Seconde, Minuut, Uur, Dag, Jaar;


    @Override
    public void init() {
        Seconde = 1;
        Minuut = Seconde * 60;
        Uur = Minuut * 60;
        Dag =   Uur * 24;
        Jaar = Dag * 365;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Er gaan zoveel secondes in een uur: " + Uur, 20, 20);
        g.drawString("Er gaan zoveel secondes in een dag: " + Dag, 20, 35);
        g.drawString("Er gaan zoveel secondes in een jaar: " + Jaar, 20, 50);
    }
}
