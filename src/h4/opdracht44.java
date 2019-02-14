package h4;

import java.applet.Applet;
import java.awt.*;

public class opdracht44 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(150, 200, 150, 20);
        g.drawLine(150, 200, 330, 200);
        g.drawLine(145, 164, 155, 164);
        g.drawLine(145, 128, 155, 128);
        g.drawLine(145, 92, 155, 92);
        g.drawLine(145, 56, 155, 56);
        g.drawLine(145, 20, 155, 20);
        g.setColor(Color.red);
        g.fillRect(180, 128, 20, 72);
        g.setColor(Color.blue);
        g.fillRect(240, 20, 20, 180);
        g.setColor(Color.green);
        g.fillRect(300, 90, 20, 110);
        g.setColor(Color.black);
        g.drawString("Valerie", 170, 215);
        g.drawString("Jeroen", 230, 215);
        g.drawString("Hans", 295, 215);
        g.drawString("20", 125, 170);
        g.drawString("40", 125, 134);
        g.drawString("60", 125, 96);
        g.drawString("80", 125, 60);
        g.drawString("100", 123, 24);

    }
}
