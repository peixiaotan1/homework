/* Program Name: Loops
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * Use for-loop to calculate the sum or product of user input.*/

import java.util.Scanner;
class forloops {
    public static void main(String[] args) {
        String input;
        int n;
        Scanner s = new Scanner(System.in);
        double user_in = 0.0;
        double res = 0.0;
        double prod = 1.0;

      /* TODO: Write a loop to keep asking after each calculation */

        while (true){
            System.out.print("Sum or product (type 'quit' to quit): ");
            input = s.next();
            if (input.equals("quit")) {
                break;
            }
            else if (!input.equals("sum") && !input.equals("product")) {
                System.out.println("Invalid operation, try again.");
                continue;
            }
            System.out.print("How many values? ");
            n = s.nextInt();
            if (input.equals("sum")) {
                //for loop to get numbers of input that user gave and add them up.
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter value #"+i+": ");
                    user_in = s.nextDouble();
                    res += user_in;
                }
                //Print output once finished the loop.
                System.out.format("Sum = %.3f\n", res);
                }
            else {
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter value #"+i+": ");
                    user_in = s.nextDouble();
                    prod *= user_in;
                }
                System.out.format("Product = %.3f\n", prod);            
                }
        }
        s.close();

    }
}