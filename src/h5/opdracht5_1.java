package h5;

import java.applet.Applet;
import java.awt.*;

public class opdracht5_1 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken lijn
        g.drawLine( 100, 50, 297, 50);
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        //begin Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawArc(530, 102, breedte, hoogte, 90, 360);
        g.setColor(opvulkleur);
        g.fillArc(530,102,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawArc(570, 220, 120, 120, 720, 360);

    }
}