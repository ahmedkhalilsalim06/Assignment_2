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
}

