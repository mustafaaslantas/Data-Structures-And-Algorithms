public class radixSort {

    public static void main(String[] args) {
        int [] array = {19, 454, 89, 14, 2, 382, 789, 572};
        System.out.println("Original Array:");
        for (int val: array) {
            System.out.print(val+" ");
        }
        System.out.println();
        int [][] radixArray = new int[10][array.length];
        int[] counts = new int[10];
        int maxVal = findMax(array);
        int exp = 1;

        while (maxVal / exp > 0){
            for(int val : array){
                int radixIndex = (val/exp)%10;
                radixArray[radixIndex][counts[radixIndex]] = val;
                counts[radixIndex]++;
            }
            int pos = 0;
            for(int i = 0; i<10; i++){
                for (int j = 0; j < counts[i]; j++){
                    array[pos] = radixArray[i][j];
                    pos++;
                }
                counts[i] = 0;
            }

            exp *= 10;
        }

        System.out.println("Sorted Array: ");
        for(int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(int val : array){
            if(val > max){
                max = val;
            }
        }
        return max;
    }



}
