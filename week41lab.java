import java.util.Scanner;
class employee
{
	void getemp()
	{
		Scanner o= new Scanner(System.in);
		System.out.println("enter name of the employee: ");
		String name=o.nextLine();
		System.out.println("enter id: ");
		int id=o.nextInt();
		System.out.println("enter designation: ");
		String sign=o.nextLine();
	}
}

class salary
{
	int np=0,hra=0,bp=0,da=0 ,pf=0;
	String name="sathish";
	salary(int bp,int hra,int da,int pf)
	{
		this.bp=bp;
		this.hra=hra;
		this.da=da;
		this.pf=pf;
	}
	 void calculatesalary()
	{
	        np = (bp + hra + da - pf);
	}
	void displayemp()
	{
		System.out.println(name+" net Pay is= "+np);
	}
}
class week41lab
{
public static void main(String args[])
{
	salary s1= new salary(5,6,7,8);
	s1.calculatesalary();
	s1.displayemp();
}
}