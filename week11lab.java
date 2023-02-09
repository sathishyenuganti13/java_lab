import java.util.*;
import java.applet.*;
import java.awt.*;

/*<applet code="week11lab" width=300 height=300></applet>*/

public class week11lab extends Applet
{
public void init()
{
System.out.println(" in init method : ");
}

public void paint(Graphics g)
{
g.drawRoundRect(10,10,37,55,300,30);
setForeground(Color.pink);
//g.fillRoundRect(10,10,37,55,300,30);
g.drawOval(100,100,28,200);
setForeground(Color.red);
g.drawArc(123,134,143,152,111,110);
//setForeground(Color.blue);
int x[]={10,19,89,54,56};
int y[]={34,65,74,29,87};
int num=5;
g.drawPolygon(x,y,num);
//setForeground(Color.cyan);

}

}
