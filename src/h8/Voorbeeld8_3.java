//Voorbeeld 8.3

import java.awt.*;
import java.applet.*;

public class Voorbeeld8_3 extends Applet {
    TextField tekstvak;


    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Type iets in het tekstvakje", 50, 60 );
    }
}