import java.util.Scanner;

class Fibanocci {
  public static void main(String args[]) {
    Scanner vikas = new Scanner(System.in);
    System.out.println("Enter the number up to you want to print series");
    int a = vikas.nextInt();
    int first = 0;
    int second = 1;
    System.out.println(first);
    System.out.println(second);
    for (int i = 1; i <= a; i++) {
      int third = first + second;
      System.out.println(third + " ");
      first = second;
      second = third;
    }

  }
}
