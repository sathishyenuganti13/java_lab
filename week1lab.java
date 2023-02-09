import java.util.*;
class Employee
{
	int id,noh;
	double salary;
	String name;
	void getinfo()
	{
		Scanner r  = new Scanner(System.in);
		System.out.println("enter name: ");
                name = r.nextLine();
		System.out.println(" enter id: ");
	        id = r.nextInt();
		System.out.println("enter salary: ");
		 salary = r.nextDouble();
		System.out.println("enter no of hours: ");
		 noh= r.nextInt();
	}
	void Addsal()
	{
		if(salary<500) salary+=10;
	}
	void AddWork()
	{
		if(noh>6) salary+=5;
	}
	void display()
	{
		System.out.println("Name= "+name+"  id= "+id+"  salary=  "+salary+"  number of hours= "+noh);
	}
}
class week1lab
{
	public static void main(String args[])
	{
		Employee obj = new Employee();		
		obj.getinfo();
		obj.Addsal();
		obj.AddWork();
		obj.display();
	}
}