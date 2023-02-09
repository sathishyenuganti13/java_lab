final class A
{
int a= 7;
void print1(){
System.out.println(" in base: ");
}
}
class B extends A
{
void print2(){
System.out.println(" in derived: ");
}
}
class week533lab
{
public static void main(String args[])
{
A obj1 = new A();
obj1.print1();
}
}