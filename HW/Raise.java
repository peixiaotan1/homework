/* Program Name: Loops
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * computer a salary raise by user's input rating.*/



import java.util.Scanner;
class Raise {
    public static void main(String[] args){
        double currentSalary; // current annual salary
        int rating;           // performance rating
        double raise;         // dollar amount of the raise
        Scanner scan = new Scanner(System.in);

        /* Get input :( */  
        System.out.print("Enter the annual salary: $");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating. 1 = Excellent, 2 = Good, 3 = Poor: ");
        rating = scan.nextInt();
        scan.close();
        
        if ( currentSalary < 20000 ) {
            System.out.println("Salary is too low. Must be over $20,000.");
            return;
        }

        /* TODO: Compute the raise. Use if/else if/else. You do not need to error check 
           for invalid ratings (i.e. ratings other than 1, 2, or 3).
           Write a comment above the if/else if/else block summarizing the block of code.
        */ 

        if (rating == 1) {
            raise = currentSalary* 0.088;
        } else if (rating == 2) {
            raise = currentSalary*0.045;
        } else{
            raise = currentSalary*0.025;
        }
        
        System.out.format("Amount of your raise: $%.2f\n", raise);
        System.out.format("Your new salary: $%.2f\n", currentSalary+raise);
    }
}