import java.util.Scanner;

public class ShortHandOperators {

public static void main(String args[])
 Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b = sc.nextInt();

     System.out.println("Difference of two numbers: "+(a-=b));
    System.out.println("sum of two numbers: "+(a+=b));
    System.out.println("Product of two numbers: "+(a*=b));
    System.out.println("Divisin of two numbers: "+(a/=b));
    System.out.println("Modulus of two numbers: "+(a%=b));
  }
}