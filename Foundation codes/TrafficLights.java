//Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow
import java.util.Scanner;
class TrafficLight
  {
public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter time in hours");
      int a=vikas.nextInt();
      System.out.println("Enter 'AM' or 'PM'");
      String b=vikas.next();
      if (((a==12)||(a==1)||(a==2)||(a==3)||(a==4)||(a==5)||(a==6)||(a==7))&&
        ((b=="am")||(b=="AM")))
      {
      System.out.println("BLOW GREEN");  
      }
      else if (((a==8)||(a==9)||(a==10)||(a==11))&&((b=="am")||(b=="AM")))
      {
      System.out.println("BLOW RED FOR EVERY TEN MINUTES");
      }
      else if (((a==12)||(a==1)||(a==2)||(a==3)||(a==4))&&((b=="pm")||(b=="PM")))
      {
      System.out.println("BLOW YELLOW");
      }
      else if (((a==5)||(a==6)||(a==7)||(a==8))&&((b=="pm")||(b=="PM")))
      {
      System.out.println("BLOW RED FOR EVERY TEN MINUTES");
      }
      else if (((a==9)||(a==10)||(a==11)) && ((b=="pm")||(b=="PM")))
      {
      System.out.println("BLOW GREEN");
      }
      else 
      {
      System.out.println("Enter valid input");
      }  
      
    } 
    }