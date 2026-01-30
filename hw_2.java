import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class hw_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        System.out.println("--------Salam--------");
        String command;
        System.out.println("write the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");
        int[] arr = array_maker(size);
        System.out.println("here is the array: " + Arrays.toString(arr));
        while (cont){
            System.out.println("1. Find the max and the min");
            System.out.println("2. Find the average and  how each element of the array differs from the average");
            System.out.println("3. Find the sum of elements with odd- and even-numbered indexes. ");
            System.out.println("4. End");
            System.out.println("Choose an operation:");

        command = sc.nextLine();

        switch (command){
            case "1":
                int mx = findMaximum(arr);
                int min = findMinimum(arr);
                System.out.println("Max " + mx);
                System.out.println("Min " + min);

            break;
            case "2":
                System.out.println(Arrays.toString(diff(arr)));
            break;
            case "3":
                System.out.println(sumOfEvenOrOdd(arr));
            break;
            case "4":
                cont = false;
            break;
            default:
                System.out.println("Choose a valid operation!");
        }

        }


        System.out.println("End!");
    }

    public static int[] diff(int[] arr){
        int av = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        for(int i = 0; i < arr2.length; i++){
            av+=arr2[i];
        }
        av/=arr.length;
        for(int i = 0; i < arr2.length; i++){
            arr2[i]-=av;
        }
        return arr2;
        
    }public static int[] array_maker(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }


    // Task e: This method calculates the sum of the elements in both odd and even indexes.
    // Parsa Hamidi
    public static String sumOfEvenOrOdd(int[] array) {
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
       return ("The even sum: " + sumE + "\n" + "The odd sum: " + sumO);
    }public static int findMaximum(int[] Array) {
        int maximum = 0; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i];

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement > maximum) {
                maximum = currentElement;
            }
        }

        return maximum;
    }public static int findMinimum(int[] Array) {
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



}
