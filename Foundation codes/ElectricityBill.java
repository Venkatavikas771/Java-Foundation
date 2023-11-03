import java.util.Scanner;
class TakingInput
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter new units on bill");
      int a=vikas.nextInt();
      System.out.println("Enter previous units on bill ");
      int b=vikas.nextInt();
      int totaluni=(a-b);
      int gst=10;
      if(totaluni<=50)
      {
      double bill=(totaluni)*0.50;
      System.out.println("The bill amount is :"+(bill)+(gst));  
      }
      else if((totaluni>50)&&(totaluni<=150))
      {
       double x=(totaluni-50)*(0.50);
        double y=x*(0.75);
      System.out.print("The bill amount is :"+(x+y)+(gst));
      }
      else if((totaluni>150)&&(totaluni<=250))
      {
      System.out.print("The bill amount is :"+(totaluni)*9+(gst));
      }
      else if(totaluni>250)
      {
      System.out.print("The bill amount is :"+(totaluni)*12+(gst));
      }
      else
      {
     System.out.println("Enter valid units");
        }
    }
  }