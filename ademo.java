class a
{
a()
{
System.out.println("hello! a ,constructor without any arguments");
}
a(int x)
{
System.out.println(" constructor with arguments: ");
System.out.println("value of x: "+x);
}
}
class ademo
{
public static void main(String args[])
{
a a1=new a(17);
}
}
