import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter the target integer:");
        int target = input.nextInt();
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("The target number is found at index: " + result);

        } else {
            System.out.println("The target number is not found");
        }

    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}


