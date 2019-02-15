package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht47 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRoundRect(140, 120, 100, 100, 10, 10);
        g.fillArc(160, 140, 15, 15, 720, 360);
        g.fillArc(205, 140, 15, 15, 720, 360);
        g.fillArc(160, 185, 15, 15, 720, 360);
        g.fillArc(205, 185, 15, 15, 720, 360);
    }
}
