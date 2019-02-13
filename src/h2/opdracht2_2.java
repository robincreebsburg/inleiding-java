package h2;

import java.applet.Applet;
import java.awt.*;

public class opdracht2_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Robin", 50, 60);
        g.setColor(Color.red);
        g.drawString("Creebsburg", 50, 70 );
    }

}