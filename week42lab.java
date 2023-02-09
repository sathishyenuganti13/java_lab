class student
{
	String name="sathish";
	int  rollno=197;
}
class test extends student
{
	int m1=73;
	int m2=78;
	int m3=81;
	int m4=88;
	int m5=69;
	int m6=90;
}
class result extends test
{
	int total=m1+m2+m3+m4+m5+m6;
}
class week42lab
{
public static void main(String args[])
{
	result obj =new result();
	System.out.println(" Name = "+obj.name+" Id = "+obj.rollno+" total marks = "+obj.total);
}
}

		