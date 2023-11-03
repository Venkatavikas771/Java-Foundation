import java.util.Scanner;
class EvenOrOdd
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide  number");
      int a=vikas.nextInt();
      if(a%2==0)
      {
      System.out.println("Is even number");  
      }
      else 
      {
      System.out.print("Is odd number");
      }
      
    }
  }  