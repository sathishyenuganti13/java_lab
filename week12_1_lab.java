import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="week11_1_lab" width=300 height=300></applet>*/

public class week11_1_lab extends Applet implements MouseListener ,MouseMotionListener
{
String msg="";
int mousex=0 , mousey=0;

public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me){
mousex=0;
mousey=10;
msg=" Mouse Clicked ";
repaint();
}

public void mouseDragged(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="Mouse Dragged";
repaint();
}

public void mousePressed(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg=" pressed ";
repaint();
}

public void mouseReleased(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg=" released ";
repaint();
}

public void mouseMoved(MouseEvent me)
{
showStatus("Mouse moving at :"+me.getX()+" , "+me.getY());
}


public void mouseEntered(MouseEvent me)
{
mousex=0;
mousey=10;
msg="entered";
repaint();
}

public void mouseExited(MouseEvent me)
{
mousex=0;
mousey=10;
msg ="exited";
repaint();
}

public void paint(Graphics g){
g.drawString(msg,mousex,mousey);
}

}








