import java.util.Scanner;
class PrintLandF
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the number want to extract");
      int num=vikas.nextInt();
      int ldigit=num%10;
      System.out.println("The last digit is :"+ldigit);
      int digit=0;             //doubt     
      while(num>0)
        {
         digit=num%10;
          num=num/10;
        }
        
       System.out.println("First digit is :"+(digit));  //If this printed outside last iteration is printed
    }
  }