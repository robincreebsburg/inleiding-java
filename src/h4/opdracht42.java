package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht42 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(130, 150, 100, 100);
        g.drawLine(180,70,130,150);
        g.drawLine(180,70,230,150);
        g.drawLine(180, 200, 150, 200);
        g.drawLine(180, 200, 180, 250);
        g.drawLine(150, 200, 150, 250);
        g.drawRect(200, 200, 20, 20);
    }
}
