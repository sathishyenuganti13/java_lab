class Outer
{
	public  int outer_x=55;
}
class Inner extends Outer
{
	void display()
	{
		System.out.println("i am in Inner class: ");
		System.out.println("value of outer_x :"+outer_x);
	}
}
class InnerClassDemo
{
	public static void main(String args[])
	{
		Inner obj= new Inner();
		obj.display();
	}
}