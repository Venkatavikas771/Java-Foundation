import java.util.Scanner;
class Table

  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("ENTER WHICH TABLE");
      int a=vikas.nextInt();
      for(int x=1;x<=10;x++)
        {
          System.out.println("TABLE OF" +a+ "IS:"+a+"x"+x+"="+a*x);
        }
        
        
    }
  }