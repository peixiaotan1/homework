/* Program Name: AdvancedCalc
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * calculate user input by swtich statement.*/

import java.util.Scanner;
class AdvancedCalc {
   public static void main(String[] args) {
        int left, right;
      /* Optional TODO: int result; 
         You may store the result in a variable or calculate as you print. */
        int result = 0;
        String operator;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter <left> <op> <right>: ");
      /* TODO: Scan the int, the operator as a string, and another int.
               Use the variables declared for you above. 
               This will take multiple lines of code to write.
               You do NOT need to error check for integers. 
               You can assume the user will only input whole numbers. */
        left = s.nextInt();
        operator = s.next();
        right = s.nextInt();
        s.close();

      /* TODO: Write the switch statement for the operators and print output.
               This will take multiple lines of code to write. */
        switch(operator){
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "*":
                result = left * right;
                break;
            case "/":
                result = left / right;
                break;
            case "%":
                result = left % right;
                break;
            case "^":
                result = (int) Math.pow(left, right);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.format("%d %s %d = %d", left, operator, right, result);
   }
}