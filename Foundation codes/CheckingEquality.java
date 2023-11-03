import java.util.Scanner;

public class CheckingEquality {
public static void main(String args[])
  {



  Scanner sc=new Scanner(System.in);



  System.out.println("Enter first number: ");
  int a=sc.nextInt();
System.out.println("Enter second number: ");
  int b=sc.nextInt();

if(a==b)
{
  System.out.println("Both numbers are equal");
}
else
{
   System.out.println("Both numbers are not equal");
}

}
}