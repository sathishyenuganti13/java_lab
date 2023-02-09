class shape
{
int a,b;
abstract void printArea();
void setdimensions(int a,int b)
{
this.a=a;
this.b=b;
}
}
class rectangle extends shape
{
void printArea(int a,int b)
{
System.out.println("area of rectangle: "+(a*b));
}
}
class triangle extends shape
{
vooid printArea(int a,int b)
{
System.out.println("area of triangle: "+( 0.5*a*b));
}
}
class circle extends shape
{
void printArea(int a,int b)
{
System.out.println("area of circle: "+ (3.14*a*a));
}
}
class week61lab
{
public void static void main(String args[])
{
