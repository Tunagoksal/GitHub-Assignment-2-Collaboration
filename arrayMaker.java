import java.util.Random;

public class arrayMaker {
    private int arraySize;
    private int[] arr;
    public static final Random random = new Random();

    public arrayMaker(int arraySize){
        this.arraySize= arraySize;
        this.arr= new int[arraySize];
    }

    public void makeArray(){
        for(int i =0;i<this.arraySize;i++){
            this.arr[i]=random.nextInt(0,101);
        }
    }


    

}
