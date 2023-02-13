import java.util.Arrays;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the array length: ");
        int length = in.nextInt();
        int [] array = arrayFunctions.createArray(length);
        System.out.println("Here is your array: " + Arrays.toString(array));
        int choice = 0;
        while (choice != 7)
        {
            System.out.println("\n"+"1-) Minimum element of the array.");
            System.out.println("2-) Maximum element of the array.");
            System.out.println("3-) Average of the array.");
            System.out.println("4-) Difference from the average for each element.");
            System.out.println("5-) Sum of the odd index elements.");
            System.out.println("6-) Sum of the even index elements.");
            System.out.println("7-) Exit."+"\n");

            System.out.print("Select the operation: ");

            if (in.hasNextInt()){
                
                choice = in.nextInt();
                System.out.println();

                if (choice == 1){
                    System.out.println("The minimum element of the array is " + arrayFunctions.minInteger(array));
                }
                else if (choice == 2){
                    System.out.println("The maximum element of the array is " + arrayFunctions.maxInteger(array));
                }                
                else if (choice == 3){
                    System.out.println("The average of the array is " + arrayFunctions.getAverage(array));
                }   
                else if (choice == 4){
                    System.out.println("The differences between the average and elements are " + Arrays.toString(arrayFunctions.displayDifferenceFromAverage(array)));
                }                
                else if (choice == 5){
                    System.out.println("Sum of the odd index elements is " + arrayFunctions.sumOfOddNums(array));
                }
                else if (choice == 6){
                    System.out.println("Sum of the even index elements is " + arrayFunctions.sumOfEvenNums(array));
                }
                else if (choice == 7){
                }  
                else {
                    System.out.println("Your input is not valid. Please input a number between 1 and 7.");
                }
            }
            else {
                System.out.println("\n\n" + "Your input is not an integer!");
                in.nextLine();
            }
        }
        in.close();
    }
}
