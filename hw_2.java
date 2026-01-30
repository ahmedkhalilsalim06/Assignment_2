import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        
    }public static int[] array_maker(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }

    //Task d: 
    //Aga
    public static int[] diff(int[] arr){
        int av = 0;
        for(int i = 0; i < arr.length; i++){
            av+=arr[i];
        }
        av/=arr.length;
        for(int i = 0; i < arr.length; i++){
            arr[i]-=av;
        }
        return arr;
    }

    // Task e: This method calculates the sum of the elements in both odd and even indexes.
    // Parsa Hamidi
    public String sumOfEvenOrOdd(int[] array) {
        int sumE = 0;
        int sumO = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumE+=array[i];
            }
            else {
                sumO +=array[i];
            }
        }
       return "The even sum: " + sumE + "\n" + "The odd sum: " + sumO;
    }


}

