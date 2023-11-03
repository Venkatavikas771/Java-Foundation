import java.util.Scanner;
class PosOrNot
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide number");
      int a=vikas.nextInt();
      if(a>0)
      {
      System.out.println("Is positive number");  
      }
      else if(a==0)
      {
      System.out.print("The value you have entered is zero please enter value");
      }
      else
      {
      System.out.println("Is negative number");
        }
    }
      
        
  }