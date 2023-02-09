import java.util.Scanner;
class newn2base
{
 void volume()
 {
  System.out.println("volume= 0 \n");
 }
 void volume(double x)
 { 
  double a,b,c;
  a=b=c=x;
  System.out.println("volume= "+(a*b*c));
 }
  void volume(int x,int y,int z)
 {
  System.out.println("volume with 3 diff parameters: \n");
  System.out.println("volume= "+(x*y*z));
 }
}
class newn2
{
 public static void main(String args[])
 {
  newn2base n2=new newn2base();
  n2.volume();
  n2.volume(3.00);
  n2.volume(4);
 }
}