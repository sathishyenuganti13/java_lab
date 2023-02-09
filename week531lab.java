             class a
{
final int a = 13;
void change()
{
//a=a/2; 
System.out.println("we cannot change final variable ");
System.out.println("after changing: "+a);
}
}
class week531lab
{
public static void main(String args[])
{
a obj = new a();
obj.change();
}
}

