import java.util.Arrays;

public class lowestValue {
    public static void main(String[] args) {

        int [] array = {19, 34, 6, 22, 199};

        int size =  array.length;
        int min =  array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Lowest value in this array is " + min);
    }
}
