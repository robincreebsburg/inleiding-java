package h4;

import java.applet.*;
import java.awt.*;

public class opdracht41 extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(100,60,50,160);
        g.drawLine(100,60,150,160);
        g.drawLine(50,160,150,160);
    }
}
