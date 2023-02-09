import java.util.Scanner;
class newn
{
public static void main(String args[])
{
  Scanner obj=new Scanner(System.in);
  System.out.println("enter name of the student: ");
  String name=obj.nextLine();
  System.out.println("enter id of the student: ");
  String id=obj.nextLine();
  System.out.println("enter baranch of the student :");
  String branch=obj.nextLine();
  System.out.println("name: "+name+" id: "+id+" branch: "+branch);
}
} 