import java.util.Scanner;
class Continue
  {
    public static void main(String args[])
    Scanner choice=new Scanner(System.in);
    {
     for(int i=1;i<=10;i++)
       {
         if(i==6)
         {
           continue;
         }
         System.out.println(i);
       }
      while(true)
        System.out.println("Enter the choices");
      System.out.println("Enter the choice 1 for exit ");
      int choose=choice.nextInt();
      System.out.println("Enter the choices 2 to contine");

      if(choose==1)
      {
       System.out.println("sucessfully exited"); 
        break;
        }
      else if(choose==2)
      {
       System.out.println("contine the program"); 
        }
      else
      {
       System.out.println("Invalid choose"); 
        }
      
      
          
        
    }
  }