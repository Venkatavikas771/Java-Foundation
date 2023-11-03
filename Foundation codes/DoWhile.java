import java.util.Scanner;
class SwitchDoWhileAtm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char choose;
      do
      {
        System.out.println("select the option");
        System.out.println("For deposit enter 1");
        System.out.println ("For withdrawl 2");
        System.out.println ("For viewbalance 3");
        System.out.println ("For exit 4");
        System.out.println("enter the option");
        int x=sc.nextInt();
        switch(x)
        {
          case 1:
         System.out.println("Enter the amount to deposit");
          int dep=sc.nextInt();
          System.out.println("Enter the previous amount");
          int pRe=sc.nextInt();
          int total=dep+pRe;
         System.out.println("Total amount after deposit is :"+(total));
            break;
         case 2:
           System.out.println("Enter the amount to withdrawl");
          int wdw=sc.nextInt();
          System.out.println("Enter the previous amount");
          int pre=sc.nextInt();
          if(pre>wdw)
          {
          System.out.println("eligible to withdrawl") ;
          }
          else
          {
          System.out.println("Insufficient balance") ;
          }
          break;
         case 3:
          System.out.println("Enter the PIN");
          int pin=sc.nextInt();
          if(pin==1456)
          {
          System.out.println("The amount is .....");
          }
          else
          {
          System.out.println("Invalid pin") ;
          } 
          break;
          case 4:
          System.exit(0);
      
          default:
        System.out.println("Enter valid pin") ;
         }
        
      }


        
        
        while(true);
    }
  }
