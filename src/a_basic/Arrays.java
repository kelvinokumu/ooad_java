package a_basic;

public class Arrays
{
    public static void main(String[] args) {
        String[] names = new String[10]; //an array to hold 10 names

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Using for each loop");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Using for loop");
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}

