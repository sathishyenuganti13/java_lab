import java.util.Scanner;
class staticdemo
{
static int x=13;
 static int y;
 static 
 { 
  System.out.println("static block is initialised ");
  y=x*4;
 }
static void meth(int x)
{ 
 System.out.println("x: "+x+" y: "+y);
}
public static void main(String args[])
{
 
 meth(x);	
}
}
 
                                                                                                                                                                                                                                                   