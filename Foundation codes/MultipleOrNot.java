import java.util.Scanner;
class MultipleOrNot
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide  number");
      int a=vikas.nextInt();
      if(a%5==0)
      {
      System.out.println("Is multiple of five");  
      }
      else 
      {
      System.out.print("Not multiple of five");
      }
      
    }
  }  