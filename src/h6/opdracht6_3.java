package h6;

import java.applet.Applet;
import java.awt.*;

public class opdracht6_3 extends Applet {
        int getal1;
        int getal2;
        int uitkomst;
    @Override
    public void init() {
        getal1 = 2147483647;
        getal2 = 1;
        uitkomst = getal1 + getal2;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst,20,20);
    }
}
