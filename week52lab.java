class Figure
{
int l=3,b=4,h=5;
double area;
void area()
{
area=0;
}
}
class Rectangle extends Figure
{
void area()
{
area = l*b;
}
void area_display()
{
System.out.println("Recatngle area = "+area);
}
}
class Triangle extends Figure
{
void area()
{
area = 0.5*b*h;
}
void area_display()
{
System.out.println("Triangle area = "+area);
}
}
class week52lab
{
public static void main(String args[])
{
Rectangle r = new Rectangle();
r.area();
r.area_display();
Triangle t =new Triangle();
t.area();
t.area_display();
}
}
