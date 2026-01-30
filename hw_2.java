import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        
    }
    
    public static int[] array_maker(int size){
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

    // Task C: 2 functions that find the minimum and maximum element in the given array
    // Muhammad Saad Siddiqui
    public static int findMinimum(int[] Array) {
        int minimum = 101; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i]; 

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement < minimum) {
                minimum = currentElement;
            }
        }

        return minimum;
    }

    public static int findMaximum(int[] Array) {
        int maximum = -1; // Define maximum with default value

        // Iterate through the entire array and find the maximum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i];

            // if current element is greater than maximum, set maximum to currentElement
            if ( currentElement > maximum) {
                maximum = currentElement;
            }
        }

        return maximum;
    }
}

