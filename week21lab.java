class staticdata
{ 	
	static String clg= "r.v.r & j.c.";
	static int x=37;
	static int y;
	static 
	{
		y=x/2;
	}
	static void display(int b)
	{
		System.out.println(" val of a= "+x+" value of b= "+y);
	}
}
class week21lab
{ 
	public static void main(String args[])
	{
		staticdata obj =new staticdata();
		obj.display(5);
	}
}