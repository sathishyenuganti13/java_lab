import java.util.Scanner;
class typecast
{
public static void main(String args[])
{
  Scanner obj=new Scanner(System.in);
  System.out.println("enter any float value: ");
  float a=obj.nextFloat();
  int c=(int)a;
  System.out.println("enter any int value: ");
  int e=obj.nextInt();
  double k	=e;
  System.out.println("value after type casting: "+c+"  " +e);
}
}