/* Program Name: Equation
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is used for 
 * getting user's input and interacting with their input.*/

 
import java.util.Scanner;
class Equation {
   public static void main(String[] args) {
      double a;
      double b;
      double c;
      double d;
      
      /*This chunck of code is use to get user's input.*/
      Scanner s = new Scanner(System.in);
      System.out.println("Enter four doubles (a * b - c + d): ");
      a = s.nextDouble();
      b = s.nextDouble();
      /* TODO: Get the next double and put it into c */
      c= s.nextDouble();
      /* TODO: Get the next double and put it into d */
      d = s.nextDouble();
      s.close();

      /* To calculate the four given inputs, and format it to two decimal place*/
      double result = a * b - c + d;
      System.out.printf("%.2f * %.2f - %.2f + %.2f = %.2f", a,b,c,d,result);



      
     
   }     
}