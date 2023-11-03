import java.util.Scanner;
class NetSalary
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("ENTER MONTHLYSALARY");
      int a=vikas.nextInt();
      int annualsalary=a*12;
      System.out.println("The total salary is :"+annualsalary);
      double fiveper=(annualsalary)*0.05;
      double tenper=(annualsalary)*0.1;
      double twentyper=(annualsalary)*0.2;
      if(annualsalary<=300000)
      {
      System.out.println("you are not allowed to pay tax");  
      }
      else if((annualsalary>300000)&&(annualsalary<=500000))
      {
      System.out.println("The net salary is:"+(annualsalary-fiveper));
      }
      else if((annualsalary>500000)&&(annualsalary<=1000000))
      {
      System.out.print("The net salary is:"+(annualsalary-tenper));
      }
      else if(annualsalary>1000000)
      {
      System.out.print("The net salary is:"+(annualsalary-twentyper));
      }
      else
      {
      System.out.print("Enter valid amount");
      }
    }
  }  