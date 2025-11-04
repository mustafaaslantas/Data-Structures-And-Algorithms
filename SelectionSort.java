public class SelectionSort {

    public static void main(String[] args) {

        int [] array= {19, 36, 2, 75, 148, 5, 34};

        int size=array.length;
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < size; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int min_value = array[min_index];
            for (int k = min_index; k > i; k--) {
                array[k] = array[k-1];
            }
            array[i] = min_value;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
}
