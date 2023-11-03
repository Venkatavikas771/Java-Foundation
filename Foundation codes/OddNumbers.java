import java.util.Scanner;
class OddInput
{
    public static void main(String args[])
    {
      Scanner odd=new Scanner(System.in);
      System.out.println("Enter the first number");
      int a=odd.nextInt();
        System.out.println("Enter the last number");
      int b=odd.nextInt();
      for(int i=a;i<=b;i++)
        {
          if(i%2!=0)
          {
            System.out.println("Then odd number between range"  +a +  "and" +  b+  "are :"  +(i) );
          }
        }
        
    }
  }