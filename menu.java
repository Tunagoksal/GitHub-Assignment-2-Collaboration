import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the array length: ");
        int length = in.nextInt();
        int [] array = GIT_Assigment2.createArray(length);
        System.out.println("\n"+"1-) Minimum element of the array.");
        System.out.println("2-) Maximum element of the array.");
        System.out.println("3-) Average of the array.");
        System.out.println("4-) Difference from the average for each element.");
        System.out.println("5-) Sum of the odd index elements.");
        System.out.println("6-) Sum of the even index elements.");
        System.out.println("7-) Exit."+"\n");
        int choice = 0;
        while (choice != 7)
        {
            System.out.println("\n"+"Select the operation: "+ "\n");
            if (in.hasNextInt()){
                choice = in.nextInt();
                if (choice == 1){
                    System.out.println("The minimum element of the array is " + GIT_Assigment2.minInteger(array));
                }
                else if (choice == 2){
                    System.out.println("The maximum element of the array is " + GIT_Assigment2.maxInteger(array));
                }
                else if (choice == 3){
                    System.out.println("The average of the array is " + GIT_Assigment2.getAverage(array));
                }
                else if (choice == 4){
                    System.out.println("The differences between the average and elements are " + GIT_Assigment2.displayDifferenceFromAverage(array));
                }
                else if (choice == 5){
                    System.out.println("Sum of the odd index elements is " + GIT_Assigment2.sumOfOddNums(array));
                }
                else if (choice == 6){
                    System.out.println("Sum of the even index elements is " + GIT_Assigment2.sumOfEvenNums(array));
                }
                else if (choice == 7){
                }
                else {
                    System.out.println("Your input is not valid. Please input a number between 1 and 7.");
                }
            }
            else {
                System.out.println("Your input is not an integer!");
                choice = 7;
            }
        }
        in.close();
    }
}
