import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        double[] unsortedArray = {19, -6, 34, 22, -1919, 535, -5484, 8785};
        double[] sortedArray = mergeSort(unsortedArray);
        System.out.println("Sorted array is: " + Arrays.toString(sortedArray));

    }
    public static double[] mergeSort(double[] array){
        if(array.length <= 1){
            return array;
        }
        int middle = (array.length/2);
        double[] leftHalf = Arrays.copyOfRange(array, 0, middle);
        double[] rightHalf = Arrays.copyOfRange(array, middle, array.length);

        double[] sortedLeft = mergeSort(leftHalf);
        double[] sortedRight = mergeSort(rightHalf);

        return merge(sortedLeft, sortedRight);
    }

    public static double[] merge(double[] left, double[] right){
        double[] result = new double[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            }
            else{
                result[k++] = right[j++];
            }

        }
        while(i < left.length){
            result[k++] = left[i++];
        }
        while(j < right.length){
            result[k++] = right[j++];
        }
        return result;
    }
}
