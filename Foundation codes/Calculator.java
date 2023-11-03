import java.util.Scanner;

class SwitchForCalculator
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=vikas.nextInt();
      System.out.println("Enter b value");
      int b=vikas.nextInt();
      System.out.println("Enter operator");
      char ch=vikas.next().charAt(0);
      switch(ch)
        {
          case '+':
          System.out.println("The addition is :"+(a+b)); 
            break;
            case '-':
          System.out.println("The subtraction is :"+(a-b));  
            break;
            case '*':
          System.out.println("The multiplication is :"+(a*b));  
            break;
            case '/':
          System.out.println("The division is :"+(a/b)); 
            break;
            case '%':
          System.out.println("The modulus is :"+(a/b));
            break;
             default:
             System.out.println("Enter valid input"); 
            }
    }
  }