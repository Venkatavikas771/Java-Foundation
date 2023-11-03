import java.util.Scanner;
classMaxBwThree
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide number");
      int a=vikas.nextInt();
      System.out.println("provide number");
      int b=vikas.nextInt();
      System.out.println("provide number");
      int c=vikas.nextInt();
      if((a>b) && (a>c))
      {
      System.out.println(a +"is greater");  
      }
      else if((b>a)&&(b>c))
      {
      System.out.print(b +"is greater");
      }
      else if((c>a)&&(c>b))
      {
      System.out.println(c+"is greater");
      }
      else if((a==b )|| (a==c) ||(b==a) ||( b==c )|| (c==a) || (c==b))
      {
      System.out.println("Entered values are equal so unable to check the greatest among three values");
      }
      else 
      {
      System.out.println("enter value");
        }
    }
      
        
  }