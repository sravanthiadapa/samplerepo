import java.util.Scanner;    // Needed for the Scanner class

/**
 * This program demonstrate local
 * variable of a method.
 */
public class LocalVariable
{
   public static void main(String[] args)
   {
      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);
      int     number1, number2; //Hold numbers

      //Get number from users
      System.out.print("Enter first integer : ");
      number1 = console.nextInt();
      System.out.print("Enter second integer : ");
      number2 = console.nextInt();
      
      //Call method to display sum
      sum(number1, number2);
   }
# new code added by developer feature 1.1
public class MethodDemo
{
   public static void main(String[] args)
   {
      System.out.println("Advantage of methods.");
      displayLine();
      System.out.println("Write once use many times");
      displayLine();
   }

   /**
    *      The displayLine method displays a line.
    */
   public static void displayLine()
   {
      for (int i = 1; i <= 40; i++)
      {
         System.out.print("_");
      }

      System.out.println(" ");
   }
}
#ended the code feature1.1  
   /**
    *  The sum method accept two arguments.
    */
   public static void sum(int num1, int num2)
   {
      int total; // local variable stores intermediate results.

      total = num1 + num2;
      System.out.println("Total : " + total);
   }
}