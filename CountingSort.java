public class CountingSort {

    public static void countingSort(int [] array){
        int max_val = array[0];
        for (int num : array){
            if (num > max_val){
                max_val = num;
            }
        }

        int[] count = new int[max_val+1];
        for (int num : array){
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max_val; i++ ){
            while (count[i] > 0){
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {19, 19, 19, 34, 34, 6, 6, 22, 22, 199, 222, 222};

        countingSort(array);

        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }


}
