class A 
{
final void change()
{
System.out.println("final method ");
}
}
class B extends A
{
void change()
{
System.out.println(" we cannot overload final method ");
}
}
class week532lab
{
public static void main(String args[])
{
B obj = new B();
obj.change();
}
}
