import java.util.Scanner;
class PowAndBase
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the power");
      int a=vikas.nextInt();
      System.out.println("Enter the base");
      int b=vikas.nextInt();
      int result=1;
      for(int x=1;x<=a;x++)
        {
          
          result=result*b;   //*we have to do iteration upto lessthan equal to the give power 
                                 
        }
        
        System.out.println("The result is :"+(result));
    }
  }