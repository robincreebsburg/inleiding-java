package h4;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(50, 120, 270, 120);
        g.drawString("Lijn", 150, 135);
        g.drawRect(50, 150, 223, 120);
        g.drawString("Rechthoek", 135, 285);
        g.drawRoundRect(50, 300, 223, 120, 10, 10);
        g.drawString("Afgeronde rechthoek", 105, 435);
        g.setColor(Color.magenta );
        g.fillRect(300, 150, 233, 120);
        g.setColor(Color.black);
        g.drawOval(300, 150, 233, 120);
        g.drawString("Gevulde rechthoek met ovaal", 340, 285);
        g.setColor(Color.magenta );
        g.fillOval(300, 300, 233, 120);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek", 365, 435);
        g.drawOval(550, 150, 233, 120);
        g.setColor(Color.magenta);
        g.fillArc(550, 150, 233, 120, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 590, 285);
        g.drawArc(600, 300, 120, 120, 720, 360);
        g.drawString("Cirkel", 645, 440);
    }
}
