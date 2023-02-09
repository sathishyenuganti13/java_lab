import java.util.Scanner;
class newn1
{
public static void main(String args[])
{
  int n,x,y;
  Scanner obj=new Scanner(System.in);
  System.out.println("1.addition\n 2.subraction\n3.multiplication\n4.division\nenter your choice: ");
  n=obj.nextInt();
  System.out.println("enter any two numbers: ");
  x=obj.nextInt();
  y=obj.nextInt();
  switch(n)
  {
   	case 1: System.out.println("the addition of two numbers: "+(x+y));
           	break;
	case 2: System.out.println(" the subraction of two numbers: "+(x-y));
		break;
	case 3: System.out.println(" the multiplication of two numbers: "+(x*y));
		break;
	case 4: System.out.println("the divsion of two numbers: "+(x/y));
		break;   
  }
}
}