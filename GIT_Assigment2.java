public class GIT_Assigment2 {

    public int getAverage(int[] arr){
        int sum = 0;
        int average = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            average = sum / arr.length;
        } 
        return average;
    }

    public void displayDifferenceFromAverage(int[] arr){
        int average = getAverage(arr);
        int[] arr1 = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i] - average;
            System.out.print(arr1[i] + " ");
        }

    }
    
    public int sumOfEvenNums(int[] arr){
        int evenSum = 0;

        for (int i = 0; i < arr.length; i+=2) {

            evenSum += arr[i];
        }
        return evenSum;
    }

    public int sumOfOddNums(int[] arr){
        int oddSum = 0;

        for (int i = 1; i < arr.length; i+=2) {

            oddSum += arr[i];
        }
        return oddSum;
    }
}