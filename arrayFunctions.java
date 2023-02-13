import java.util.Random;

public class arrayFunctions {

    public static int[] createArray(int length){
        int[] arr = new int[length];
        Random random = new Random();

        for(int i =0; i<length; i++){
            arr[i] = random.nextInt(0,101);
        }
        return arr;
    }

    //returns the avarage of the numbers in the array
    public static int getAverage(int[] arr){
        int sum = 0;
        int average = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            average = sum / arr.length;
        } 
        return average;
    }

    // returns the each numbers difference from the avarage of the array
    public static int[] displayDifferenceFromAverage(int[] arr){
        int average = getAverage(arr);
        int[] arr1 = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i] - average;
        }
        return arr1;
    }
    
    // returns the sum of even indexed numbers of the array
    public static int sumOfEvenNums(int[] arr){
        int evenSum = 0;

        for (int i = 0; i < arr.length; i+=2) {
            evenSum += arr[i];
        }
        return evenSum;
    }

    // returns the sum of odd indexed numbers of the array
    public static int sumOfOddNums(int[] arr){
        int oddSum = 0;

        for (int i = 1; i < arr.length; i+=2) {
            oddSum += arr[i];
        }
        return oddSum;
    }

    //Returns the minimum integer of a given array
    public static int minInteger(int[] arr) {
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < currentMin) {
                currentMin = arr[i];
            }
        }
        return currentMin;
    }

    //Returns the maximum integer of a given array
    public static int maxInteger(int[] arr) {
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }
}