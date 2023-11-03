import java.util.Scanner;

public class Unicode {

public static void main(String args[])
  {


Scanner scanner = new Scanner(System.in);  
char character = scanner.next().charAt(0);  
int asciiValue =(int)character; 

System.out.println("The percentage is :"+(asciiValue));
  }
}