import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char choose;
      do
      {
        System.out.println("select the operator");
        System.out.println("For Addition enter +");
        System.out.println ("For Subtraction -");
        System.out.println ("For Multplication *");
        System.out.println("For division /");
        System.out.println("enter the operator");
        char ch=sc.next().charAt(0);
        System.out.println("enter a and b values");
          int a=sc.nextInt();
          int b=sc.nextInt();
        switch(ch)
        {
          case '+':
         System.out.println("addition is"+ (a+b));
            break;
         case '-':
          System.out.println("subtraction is"+ (a-b));
          break;
         case '*':
          System.out.println(" multplication is"+ (a*b));
          break;
         case '/':
          System.out.println(" division is"+ (a/b));
          break;
          default:
         System.out.println("invalid operator");
         }
        System.out.println("want to continue choose ---> y");
        choose=sc.next().charAt(0);
      }
        while(choose=='y'||choose=='Y');
    }
  }
