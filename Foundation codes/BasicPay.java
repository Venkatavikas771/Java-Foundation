import java.util.Scanner;
class Basicpay
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter Basic pay");
      double basicpay=vikas.nextDouble();
      if ((basicpay >0) && (basicpay <= 10000))
      {
      System.out.println("Gross salary is" + (basicpay+basicpay*(0.2)+basicpay*(0.8)));
      }
      else if ((basicpay >= 11000) && (basicpay <= 20000))
      {
      System.out.print("Gross salary is" + (basicpay+basicpay*(0.25)+basicpay*(0.9)));
      }
      else if (basicpay > 20000)
      {
      System.out.print("Gross salary is" + (basicpay+basicpay*(0.3)+basicpay*(0.95)));
      }
      else
      {
      System.out.print("enter  pay ");
      }
    } 
    }