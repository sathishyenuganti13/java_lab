import java.util.*;
class A
{
int b,l,area;
void area()
{
area=b*l;
}
void area(int b,int l)
{
area= b*l;
}
void area_display()
{
System.out.println("area of the rectangle: "+area);
}
}
class week51lab
{
public static void main(String args[])
{
	A obj = new A();
	Scanner s = new Scanner(System.in);
	System.out.println(" enter length: ");
	int l = s.nextInt();
	System.out.println(" enter breadth: ");
	int b= s.nextInt();
	obj.area(); // method with no paremeters
	obj.area_display();
	obj.area(l,b); // method wit parameters
	obj.area_display();
}
}
