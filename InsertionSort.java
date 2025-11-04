
public class InsertionSort {

    public static void main(String[] args) {
        int [] array = {19, 34, 6, 22, 199};

        int size = array.length;

        for (int i = 1; i < size; i++) {
            int insertIndex = i;
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                insertIndex = j;
                j--;
            }
            array[insertIndex] = currentValue;
        }
        System.out.println("Sorted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }


}
