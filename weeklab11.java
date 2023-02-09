import  java.util.*;
import java.awt.*;
import java.applet.*;

/*<applet code= "weeklab11" height=200 width=200></applet>*/

public class weeklab11 extends Applet
{
public void init()
{
System.out.println(" in init method ");
}

public void start()
{
System.out.println(" in start method ");
}

public void paint(Graphics g)
{
g.drawLine(0,0,100,100);
g.drawLine(50,50,20,200);
}

}



