/* Program Name: Loops
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * Use loop the raise e to certain power.*/

import java.util.Scanner;
class Loops {
   public static void main(String[] args) {
      double exponent;
      double result = 0.0;
      Scanner s = new Scanner(System.in);

      /* TODO: Write a loop here to keep executing the prompt
               and the result (or "Invalid Input.") until the user types "quit".
      
               Inside the loop, test to see if the scanner can extract a double. If
               it cannot, then extract the input as a string.

               If you extract a string and the value is "quit",
               then quit the program. If that string is
               NOT "quit", print "Invalid input." but do not exit the program.
               
               If a double was extracted, raise e to the exponent and print out
               the result matching the sample output. */
        do{
            System.out.print("Enter exponent: ");

            if (!s.hasNextDouble()){
                String input = s.next();
                if (!input.equals("quit")){
                    System.out.println("Invaild input.");
                } else{
                    break;}
  
            } else {
                exponent = s.nextDouble();
                result = Math.pow(Math.E, exponent);
                System.out.format("Result = %.4f\n", result);
            }


        }while(true);

        
      s.close();
   }
}