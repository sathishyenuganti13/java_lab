class student
{
  int a,b,c;
  student(int a,int b,int c)
  { 
     this.a=a;
     this.b=b;
     this.c=c;
  }
  void m()
  { 
     System.out.println("calling m and then remainig ");
     this();
  }
  student()
  {
     this(3,4,55);
  }
  void student_display()
  {
     System.out.print("x: "+a+" y: "+b+" z: "+c);
  }
}
class studentdemo
{
  public static void main(String args[])
  {
     student s1=new student();
     s1.m();
  }
}