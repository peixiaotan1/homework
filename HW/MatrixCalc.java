/* Program Name: MatrixCalc
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * implement matrix multiplcation.*/

import java.util.Scanner;
class MatrixCalc {
    private final static int VECTOR_SIZE = 3;
    private final static int MATRIX_SIZE = VECTOR_SIZE * VECTOR_SIZE;
    public static void main(String[] args) {
        /* TODO: Create a new array of doubles called matrix that can store MATRIX_SIZE
                 number of values.
                 Then create a new array of doubles called vector that can store VECTOR_SIZE
                 number of values. */
        double[] matrix = new double[MATRIX_SIZE];
        double[] vector = new double[VECTOR_SIZE];
        Scanner s = new Scanner(System.in);
        System.out.format("Enter %d matrix values: ", MATRIX_SIZE);
        /* TODO: Use a for loop to input MATRIX_SIZE number of doubles and store it into the
                 matrix. The first value should go into matrix[0], second into matrix[1] and so
                 forth. NOTE: You MUST use a for loop to accomplish this. */
        for (int i=0; i<matrix.length; i++){
            matrix[i] = s.nextDouble();
        }
        System.out.format("Enter %d vector values: ", VECTOR_SIZE);  
        /* TODO: Use a for loop to input VECTOR_SIZE number of doubles and store it into the
                 vector. The first value should go into vector[0], second into vector[1] and so
                 forth. NOTE: You MUST use a for loop to accomplish this. */
        for (int i=0; i<VECTOR_SIZE; i++){
            vector[i] = s.nextDouble();
        }                 
        s.close();
        /* TODO: Call the multiply method and pass it the matrix first and then the vector. 
                 Store the result in another array called result. 
                 NOTE: multiply returns the array,
                 so do NOT create it and then get it from multiply. */
        double[] result = multiply(matrix, vector);
        System.out.print("Result = [");
        printVector(result);
        System.out.println("]");
    }
    private static void printVector(double[] arr) {
        /* TODO: Print the array 'arr'. You will need a for loop for this.
                 Take note that there are spaces between each value and that
                 there is NO space after the last value printed! */
        for (double i : arr){

            System.out.format("%.3f",i);
            if (i != arr[arr.length - 1]){
                System.out.print(" ");
            }
        }

    }
    private static double[] multiply(double[] matrix, double[] vector) {
        /* TODO: Create a new array called result that stores VECTOR_SIZE number
                 of values. This will be the result you return. */
        double[] result = new double[VECTOR_SIZE];
        /* TODO: Calculate result. There are VECTOR_SIZE number of values in the
                 result. You will need TWO for loops. The *outer* for loop
                 will loop through each row, whereas the *inner* for loop
                 will loop through each column. */
        for (int i = 0; i < VECTOR_SIZE; i++) {
            for (int j = 0; j < VECTOR_SIZE; j++) {
                result[i] += matrix[i * VECTOR_SIZE + j] * vector[j];
            }
        }
        
        /* TODO: Return the result out of the method. */
        return result;
    }
}