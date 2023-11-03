import java.util.Scanner;
class CountNoDigits
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the number want to count the digits");
      int num=vikas.nextInt();
      int count=0;
      while(num>0)
        {
          count=(count+1);
          num=num/10;
        }
        
       System.out.println("The number of digits :"+(count));
    }
  }