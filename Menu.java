import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        int length = 0;
        System.out.print("Enter the length for the array : ");
        length = input.nextInt();

        int[] arr =  GIT_Assigment2.createArray(length);

        System.out.println("Created array " + Arrays.toString(arr));
       
        System.out.println();
        System.out.println("1 - Find minimum value of the array");
        System.out.println("2 - Find maximum value of the array");
        System.out.println("3 - Find average of the array");
        System.out.println("4 - Display differences from the average of the array");
        System.out.println("5 - Find sum of odd-indexed elements");
        System.out.println("6 - Find sum of even-indexed elements");
        System.out.println("7 - Exit");
        System.out.println();

        int choice = 0;
        


        while(choice != 7){
            System.out.print("Select an operation : ");

            if(input.hasNextInt()){

                choice = input.nextInt(); 

                if(choice == 1){
                    System.out.println("Minimum value of the array is : " + GIT_Assigment2.minInteger(arr) + "\n");

                }
                else if(choice == 2){
                    System.out.println("Maximum value of the array is : " + GIT_Assigment2.maxInteger(arr) + "\n");  
                }

                else if(choice == 3){
                    System.out.println("Average of the array is : " + GIT_Assigment2.getAverage(arr) + "\n");
                }

                else if(choice == 4){
                    System.out.println("Difference from the average : " + Arrays.toString(GIT_Assigment2.displayDifferenceFromAverage(arr)) + "\n");
                }

                else if(choice == 5){
                    System.out.println("Sum of odd-indexed elements is : " + GIT_Assigment2.sumOfOddNums(arr) + "\n");   
                }

                else if(choice == 6){
                    System.out.println("Sum of even-indexed elements is : " + GIT_Assigment2.sumOfEvenNums(arr) + "\n");
                }

                else if(choice == 7){
                }

                else{
                    System.out.print("Please enter a valid number : ");

                }
            }
            else{
                System.out.println("Unvalid operation !");
                choice = 7;
            }
        
        
    }

}  
}