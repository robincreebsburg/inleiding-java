package h6;

import java.applet.Applet;
import java.awt.*;

public class opdracht6_1 extends Applet {
    int Geld, Personen;
    double uitkomst;

    @Override
    public void init() {
        Geld = 113;
        Personen = 4;
        uitkomst = 113/4;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst, 20,20);
        g.drawString("Ali krijgt: " + uitkomst, 20,35);
        g.drawString("Jeannette krijgt: " + uitkomst, 20,50);
        g.drawString("Ik krijg: " + uitkomst, 20,65);
    }
}


