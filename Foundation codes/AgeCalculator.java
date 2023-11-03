import java.util.Scanner;
class AgeCal
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("ENTER BIRTH YEAR");
      int a=vikas.nextInt();
      System.out.println("ENTER BIRTH MONTH");
      int b=vikas.nextInt();
      System.out.println("ENTER BIRTH DAY");
      int c=vikas.nextInt();
      int year=2023-(a);
      int month=12-(b);
      int date=30-(c);
      System.out.println("THE AGE IS :"+date+"/"+month+"/"+year);
      if(year>=18)
      {
      System.out.println("The age is :"+date+"/"+month+"/"+year+":Therefore MAJOR");
      }
      else if(year<18)
      {
      System.out.println("The age is :"+date+"/"+month+"/"+year+":Therefore MINOR");
      }
      else 
      {
      System.out.println("Enter valid age");
      }
     }
      
  }