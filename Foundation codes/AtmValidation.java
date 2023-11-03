import java.util.Scanner;
class ATmValidation
  {
    public static void main(String args[])
    {
    Scanner pass=new Scanner(System.in);
    
     while(true)
       {
      System.out.println("Enter the password pin");
      int choose=pass.nextInt();
         
       if(choose==2345)
      {   
       System.out.println("Correct password");
        break;
      }
         else
       {
           System.out.println("InCorrect password"); 
         }
      }
     
       }
       
    }
      
      
  