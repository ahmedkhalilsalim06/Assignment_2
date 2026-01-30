import java.util.Random;
import java.util.Scanner;

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
        for(int i = 0; i < arr.length; i++){
            av+=arr[i];
        }
        av/=arr.length;
        for(int i = 0; i < arr.length; i++){
            arr[i]-=av;
        }
        return arr;
        
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
    }


}

