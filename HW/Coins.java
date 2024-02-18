/* Program Name: Coins
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 *calculate the correct change of coins by input.*/
import java.util.Scanner;

class Coins {
    public static void main(String[] args){
        final int qvalue = 25;
        final int dvalue = 10;
        final int nvalue = 5;
        
        //Get user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of change (0-99): ");
        int cents = s.nextInt();
        s.close();

        //Calculate the change and print output
        int numQ = cents/qvalue;
        int numD = cents%qvalue/dvalue;
        int numN = cents%qvalue%dvalue/nvalue;
        int numP = cents%nvalue;

        System.out.format("Number of quarters: %d%nNumber of quarters: %d%nNumber of quarters: %d%nNumber of quarters: %d", numQ,numD,numN,numP);

    }
}