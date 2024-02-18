/* Program Name: ElapsedSeconds
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 *use modulo arithmetic and integer division to interact with user's input.*/
import java.util.Scanner;
class ElapsedSeconds {
   public static void main(String[] args) {
      int dataInSeconds, hours, minutes, seconds;

      Scanner s = new Scanner(System.in);

      /*To get and store user's input */
      System.out.print("Enter the elapsed time in seconds: ");
      /* TODO: Use the Scanner to store the data entry in dataInSeconds */
      dataInSeconds = s.nextInt();
      s.close();

      /* Calculate the input to hours, minutes, and seconds */
      hours =  dataInSeconds/3600;  //1 hour = 60 mins = 3600sec
      minutes = dataInSeconds%3600/60;
      seconds = dataInSeconds%60;

      /* TODO: Output the data as "___ seconds is ___ hours, ___ minutes, ___ seconds."
         Use System.out.format OR System.out.println. See example for output.
      */
      System.out.format("%d seconds is %d hours, %d minutes, %d seconds!",dataInSeconds,hours,minutes,seconds);
   }
}