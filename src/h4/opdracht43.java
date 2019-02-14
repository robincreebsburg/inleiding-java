package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht43 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(100, 400, 100, 150);
        g.setColor(Color.red);
        g.fillRect(100, 100, 125, 35);
        g.setColor(Color.white);
        g.fillRect(100, 135, 125, 35);
        g.setColor(Color.blue);
        g.fillRect(100, 170, 125, 35);
        g.setColor(Color.black);
        g.drawRect(100, 100, 124, 104);

    }
}
