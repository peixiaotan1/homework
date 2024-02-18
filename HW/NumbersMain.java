/* Program Name: NumbersMain
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * get user inputs and perform the object methods.*/

import java.util.Scanner;
class NumbersMain {
   public static void main(String[] args) {
      boolean isrunning = true;
      Statistics mystats = new Statistics();
      Scanner s = new Scanner(System.in);
      do {
         do {
            System.out.print("Enter an integer (\"quit\" to quit): ");
            if (!s.hasNextInt()) {
               if (s.next().equals("quit")) {
                  isrunning = false;
                  break;
               }
               System.out.println("You did not enter an integer, try again.");
            }
            else {
               /* TODO: Add the next integer value from the scanner to myclass. */
               mystats.addValue(s.nextInt());
               break;
            }
         } while (true);
      } while (isrunning);
      s.close();
      
      /* TODO: Finish the TODO's below. No calculations will be in these TODOs. Instead,
               you must use the appropriate method to get the desired value */
      System.out.format("Number of values entered = %d%n", mystats.getNumValues());
      System.out.format("Sum of all values        = %d%n", mystats.getSum());
      System.out.format("Product of all values    = %d%n", mystats.getProduct());
      System.out.format("Biggest value            = %d%n", mystats.getMax());
      System.out.format("Smallest value           = %d%n", mystats.getMin());
      System.out.format("Average of all values    = %.2f%n", mystats.getAverage());
   }
}