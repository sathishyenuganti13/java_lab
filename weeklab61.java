abstract class shape
{
double l,b;
abstract void printArea();
}

class rectangle extends shape
{
rectangle(double a,double c)
{
l=a;
b=c;
}
void printArea()
{
System.out.println("the area of the rectangle: "+(l*b));
}
}

class triangle extends shape
{
triangle(double a,double c)
{
l=a;
b=c;
}
void printArea()
{
System.out.println("the arae of traingle: "+(0.5)*l*b);
}
}

class circle extends shape
{
double area;
circle(double a)
{
l=a;
}

void printArea()
{
 area= 3.14*l*l;
System.out.println(" the area of circle: "+ area);
}
}

class weeklab61
{
public static void main(String args[])
{
triangle t= new triangle(6,40);
t.printArea();
rectangle r= new  rectangle(3,4);
r.printArea();
circle c=  new circle(3);
c.printArea();
}
}