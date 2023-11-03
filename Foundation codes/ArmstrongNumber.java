import java.util.Scanner;
class ArmstrongNum
  {
     public static void main(String args[])
    {
    Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the number to check armstrong or not");
      int num=vikas.nextInt();
      int count=0;
      int sum=0;
     int temp=num;
     int temp1=num;
      int ldigit;
      while(num>0)
        {
          ldigit=num%10;
          count=(count+1);
          num=num/10;
        }
      
     
       while(temp>0)
         {
           int power=count;
           ldigit=temp%10;
          
           int res=1; 
           for(int i=1;i<=power;i++)
             {
               res=res*ldigit;
               sum=sum+res;
            }
            temp=temp/10;
         }
        
      if(sum==temp1)
      {
         System.out.println("Is a armstrong");
      }
      else
      {
         System.out.println("Not an armstrong");
      }
     }
  }

/*import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner vikas=new Scanner(System.in);
System.out.println("Enter the number to check armstrong or not");
int num=vikas.nextInt();
int count=0;
int temp1=num;
int temp=num;
int sum=0;
int ldigit=0;
while(num>0)
{
ldigit=num%10;
count=(count+1);
num=num/10;
}
int power=count;
 
while(temp1>0)
{
 
ldigit=temp1%10;
temp1=temp1/10;
int res=1;
for(int i=1;i<=power;i++)
{
res=res*ldigit;
 
}
 
sum=sum+res;
 
}
 
if(sum==temp)
{
System.out.println("Is a armstrong");
}
else
{
System.out.println("Not an armstrong");
}
}
}*/

/*public class StackDemo2 {
    private int maxSize; // maximum size of the stack
    private int[] stackArray; // array to hold the stack elements
    private int top; // top of the stack

 

    // Constructor to initialize the stack
    public StackDemo2(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is initially empty
    }

 

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

 

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

 

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

 

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

 

    // Method to get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

 

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No elements to display.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

 

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackDemo2 stack = new StackDemo2(5);

 

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

 

        stack.pop();
        stack.display();

 

        System.out.println("Top element: " + stack.peek());

 

        stack.pop();
        stack.pop();
        stack.display();

 

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}*/

*/

public class Main
{
  public static void main(String[] args) {
      int n=153;
      int temp1=n;
      int temp2=n;
      int power=0;
      int sum=0;
      while(n>0)
      {
        n=n/10;
        power++;
      }
      System.out.println(power);
      while(temp1>0)
      {
         // int pow=power;
          int ldigit=temp1%10;
          int res=1;
          for(int i=1;i<=power;i++)
          {
              res=res*ldigit;
          }
          sum=sum+res;
          temp1=temp1/10;
      }
      if(temp2==sum)
      {
          System.out.println("Is a armstrong number");
      }

  }
}