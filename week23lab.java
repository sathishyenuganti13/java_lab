class c
{
	void read(int ...x)
	{
		for (int i:x) 
		{
		System.out.println("current value of x= "+i);
		}
	}
}
class week23lab
{
	public static void main(String args[])
	{
		c c1 =new c();
		c1.read(1,2,3,4,5,6,7,8,9,90,5);
	}
}