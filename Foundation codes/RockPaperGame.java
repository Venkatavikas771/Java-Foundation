import java.util.Scanner;
class Game
{
public static void main(String args[])
    {
      System.out.println("WELCOME TO THE ROCK,PAPER AND SCISSOR GAME");
      Scanner vikas=new Scanner(System.in);
      System.out.println("USER");
      char a=vikas.next().charAt(0);
      System.out.println("COMPUTER");
      char b=vikas.next().charAt(0);
      if (((a=='r')||(a=='R')) && ((b=='S')||(b=='s')))
      {
      System.out.println("USER WINS");  
      }
      else if(((a=='s')||(a=='S')) && ((b=='r')||(b=='R')))
      {
      System.out.println("COMPUTER WINS");
      }
      else if (((a=='r')||(a=='R')) && ((b=='P')||(b=='p')))
      {
      System.out.println("COMPUTER WINS");
      }
      else if (((a=='P')||(a=='p')) && ((b=='R')||(b=='r')))
      {
      System.out.println("USER WINS");
      }
      else if (((a=='P')||(a=='p') && (b=='S')||(b=='s')))
      {
      System.out.println("COMPUTER WINS");
      }
      else if (((a=='S')||(a=='s') && (b=='p')||(b=='P')))
      {
      System.out.println("user WINS");
      }  
      else 
      {
      System.out.println("Enter valid input");
      }  
      
    } 
    }