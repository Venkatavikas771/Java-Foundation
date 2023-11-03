import java.util.Scanner;

public class Expression {
public static void main(String args[])
  {
 Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b = sc.nextInt();

     System.out.println("Difference of post and pre decrement: "+(a-- - --a));
    System.out.println("post decrement: "+(a--));
    System.out.println("Left shift: "+(a>>2));
    System.out.println("Logical And: "+(a&b));
    
  }
}