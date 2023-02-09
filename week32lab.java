class time
{
int sec,min,hours;
time()
{
	sec=min=hours=0;
}
time(int s)
{
	sec=s%60;
	min=s/60;
	hours=min/60;
	min=min%60;
}
time(int m,int s)
{
	min=m+s/60;
	sec=s%60;
	hours=m/60;
	min=min%60;
}
time(int s,int m,int h)
{
	sec=s%60;
	min=m+s/60;
	hours=h+m/60;
	min=min%60;
}
public void display()
{
	System.out.println("Hours= "+hours+" Min= "+min+" Seconds= "+sec);
}
}
class week32lab
{
public static void main(String args[])
{
	time o= new time(50000);
	o.display();
}
}	
	

	