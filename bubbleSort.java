public class bubbleSort {
    public static void main(String[] args) {

        int [] array = {19, 34, 6, 22, 1919};
        int size = array.length;

        for (int i = 0; i < size-1; i++) {
            for (int j= 0; j < size-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
