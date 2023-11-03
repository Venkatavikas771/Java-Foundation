import java.util.Scanner;
class PerOrNot       //sum of the all factors of a num is equal to the original num.
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
     System.out.println("Enter the number to check perfect or not");
      int a=vikas.nextInt();
       int sum=0;
      for(int i=1;i<a;i++)
        {
          if(a%i==0)
          {
           sum=sum+i;
            
          }
          
        }
      System.out.println(sum);
          if(sum==a)
          {
            System.out.println("Is a perfect");
          }
          else
          {
            System.out.println("Not a perfect");
          }
        }
    }
  
