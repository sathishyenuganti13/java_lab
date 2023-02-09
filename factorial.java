import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter number to cal factorial :");
int n=obj.nextInt();
int t=n;
int sum=1;
while(n!=0)
{
 sum=sum*n;
 n--;
}
System.out.println("the factorial value of "+t+" is= "+sum);
}
}