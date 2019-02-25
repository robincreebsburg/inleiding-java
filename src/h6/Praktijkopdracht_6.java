package h6;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht_6 extends Applet {
        double cijfer1;
        double cijfer2;
        double cijfer3;
        double uitkomst;

    @Override
    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;
        uitkomst = (int) (uitkomst * 10);
        uitkomst = uitkomst / 10;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20,20);
    }
}
