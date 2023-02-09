import java.util.*;

class weeklab8
{   
public static void main(String[] args) 
{  

try
{
Scanner ob= new Scanner(System.in);


System.out.println( " Enter size of the array : ");
int n = ob.nextInt();
if (n < 0 )
{
throw new NegativeArraySizeException();
}
else{
int[] a= new int[n];
System.out.println(" size of the array :" + n);
}

}
catch(NegativeArraySizeException e)
{
System.out.println(" Negative Array Size entered" );
}
  
}

}  
