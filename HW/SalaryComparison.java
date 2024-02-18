/* Program Name: Salary Comparsion
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * takes two, pre-tax annual job salaries and compares their monthly take-home pay 
 * as well as how to budget for needs/wants/savings for each salary.*/
import java.util.Scanner;

class SalaryComparison {
    public static void main(String[] args) {
        /*TODO: Create a Scanner called s and instantiate it with System input */
        Scanner s = new Scanner(System.in);
        int salaryInput1, salaryInput2;
        
        /* This chunck of code to get user's inputs for their salary.*/
        System.out.print("Enter the salary for the first job (no commas): $");
        /* TODO: Store the response in salaryInput1 using the Scanner */
        salaryInput1 = s.nextInt();
        System.out.print("Enter the salary for the second job (no commas): $");
        /* TODO: Store the response in salaryInput2 using the Scanner */
        salaryInput2 = s.nextInt();
        s.close();

        /* Create two budget objects and calculate Take Home Pay with its method */
        /* TODO: Create an object called job1 of the class Budget and instantiate it with salaryInput1 (Hint: you will use an equals sign, the "new" keyword, and the constructor) */
        Budget job1 = new Budget(salaryInput1);
        /* TODO: Create an object called job2 of the class Budget and instantiate it with salaryInput2 (Hint: you will use an equals sign, the "new" keyword, and the constructor) */
        Budget job2 = new Budget(salaryInput2);        
        /* TODO: Call the calculate Take Home Pay (calculateTHP) method on job1 (it's a void method) */
        job1.calculateTHP();
        /* TODO: Call the calculate Take Home Pay (calculateTHP) method on job2 (it's a void method) */
        job2.calculateTHP();

        /* Calculate the needs, wants, and saving, then print the output for job1 */
        double needs, wants, savings;
        needs = job1.calculateBudgetCategory(50);
        wants = job1.calculateBudgetCategory(30);
        savings = job1.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 1: $%.2f\n", job1.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);

        /*Calculate the needs, wants, and saving, then print the output for job2 */
        needs = job2.calculateBudgetCategory(50);
        wants = job2.calculateBudgetCategory(30);
        savings = job2.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 2: $%.2f\n", job2.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);
    }
}