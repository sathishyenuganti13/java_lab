import java.util.*;
interface students
{
void getvalue();
}

interface dept
{
void getattendence();
}

class exam implements students,dept
{
int sno,rollno;
String sname,ssec;
int marks[];
Scanner obj = new Scanner(System.in);
public void getvalue()
{
System.out.println(" Enter orderly: name:: rollno :: section ");
sname= obj.next();
rollno= obj.nextInt();
ssec=obj.next();
public void getattendence()
{
System.out.println("Enter the attendence  of last 6 months : ");
for(int i=0; i< 6;i++)
{
marks[i]=obj.nextInt();
}
}
}
double finale=0;
double calattendence()
{
double sum=0;
for(int i=0;i<6;i++)
{
sum+=marks[i];
}
finale = sum/6;
return finale;
}

boolean eligible()
{
if(finale>=75) return true;
return false;
}
}

class weeklab62
{
public static void main(String args[])
{
int n;
Scanner obj= new Scanner(System.in);
System.out.println("enter no of students: ");
n=obj.nextInt();
System.out.println(" Name\trollno\tAttendence\tEligibility");
for(int i=0;i<n;i++)
{
exam stu = new exam();
stu.getvalue();
stu.calattendence();
if(stu.eligible())  {
System.out.println( stu.sname+"\t["+stu.rollno+"]\t"+stu.finale+"\tYES");
}
else
System.out.println( stu.sname+"\t["+stu.rollno+"]\t"+stu.finale+"\tNO");
}
}
}





