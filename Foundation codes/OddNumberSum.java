import java.util.Scanner;
class OddSum
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the last number you want to find");
      int a=vikas.nextInt();
      int sum=0;
      for(int x=1;x<=a;x++)
        {
          if(x%2!=0)
          {
            sum=sum+x;
          }
        }
        
       System.out.print(sum+" "); 
    }
  }