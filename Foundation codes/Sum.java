import java.util.Scanner;
class NatuSum
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the last number you want to find");
      int a=vikas.nextInt();
      int sum=0;
      for(int x=1;x<=a;x++)
        {
         
          System.out.print(x+" "); 
           sum=sum+x;
        
        }
        
        System.out.println("The sum is natural numbers up to " +a+ "is :"+sum+" "); 
    }
  }