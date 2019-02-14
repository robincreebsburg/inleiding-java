package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht46 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.fillRoundRect(150, 75, 75, 150, 10, 10);
        g.setColor(Color.red);
        g.fillArc(168, 78, 40, 40, 720, 360);
        g.setColor(Color.orange);
        g.fillArc(168, 125, 40, 40, 720, 360);
        g.setColor(Color.green);
        g.fillArc(168, 172, 40, 40, 720, 360);

    }
}
