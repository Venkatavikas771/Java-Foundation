


import java.util.Scanner;
class StrongOrNot    //sum of the factorial is equal to the original number
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int number=sc.nextInt();
      int temp=number;
      int sum=0;
      int digit;
       while(number>0)
        {
           digit=number%10;
       int fact=1;
          for(int i=1;i<=digit;i++)
            {
              fact=fact*i;
            }
          sum=sum+fact;
          number=number/10;
          
        }
      if(sum==temp)
      {
        System.out.println("strong number");
      }
      else
        System.out.println("not a strong number");
      
    }
  }