import java.util.Scanner;
class Factorial
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the number");
      int a=vikas.nextInt();
      int fact=1;
      for(int i=1;i<=a;i++)
        {
         fact=(fact*i);
         }
      System.out.println(fact);
      }
    }
  