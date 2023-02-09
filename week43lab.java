import java.util.*;
class employee
{
	String name;
	int id,salary;
	void read_emp()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name = ");
		name= s.nextLine();
		System.out.println("enter id: ");
		id = s.nextInt();
		System.out.println("enter salary: ");
		salary = s.nextInt();
	}
}
class permanent_employee extends employee
{
	void print_emp()
	{
	System.out.println(" permanent employee details: ");
	System.out.println("name = "+name+" id= "+id+" Salary= "+(salary*1.05));
	}
}
class temporary_employee extends employee
{
	void print_emp()
	{
	System.out.println(" temporaray employee details: ");
	System.out.println("name = "+name+" id= "+id+" Salary= "+(salary*1.035));
	}
}
class week43lab
{
public static void main(String args[])
{
	System.out.println("enter  permanent employee details: ");
	permanent_employee obj= new permanent_employee();
	obj.read_emp();
	obj.print_emp();
 	System.out.println("enter temporary employee details: ");
	temporary_employee obj1= new  temporary_employee();
	obj1.read_emp();
	obj1.print_emp();
}
}
	
	
		