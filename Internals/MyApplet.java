import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet {
 public void paint(Graphics g){
   g.drawString("Hello",200,200);
 }
}

/*<applet code="MyApplet.class" width="200" height="200"></applet>*/