import java.util.*;
import java.awt.*;
import java.applet.*;

/*<applet code = "APPLET197" height= 250 width= 100 >
<param name= "name" value= "sathish" >
<param name= "section" value  ="cse-c" >
<param name= " roll.no"  value= "Y21cs197 " >
<param name= " college_name" value=" R.V.R & JC CLG ">
<param name= "year" value="2nd year" >
 </applet> */

public class APPLET197 extends Applet

{

public void init()
{
System.out.println("in it");
}


public void start()
{
/*System.out.println(" in start method ");*/

}

public void stop()
{
/*System.out.println(" in stop method" );*/
}

public void destroy()
{
/*System.out.println(" in destroy method ");*/
}

public void paint(Graphics g)
{
g.drawString(" ths is my first program using aplpets ",50,50);
g.drawString(" Name = " +  getParameter("name"),100,100);
g.drawString(" Rollno = "+ getParameter("rollno"),110,110);
g.drawString(" section  = "+ getParameter("section"),120,120);
g.drawString(" colege = "+ getParameter(" college_name" ),130,130);
}
}