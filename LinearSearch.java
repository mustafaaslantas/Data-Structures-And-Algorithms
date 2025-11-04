import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter the target integer:");
        int target = input.nextInt();

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Value " + target + " found at index " + result);
        } else {
            System.out.println("Value " + target + " not found");
        }
    }

    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    }

