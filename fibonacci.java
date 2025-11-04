public class fibonacci {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int sum = 0;

        System.out.print(first + " " + second + " ");
        for (int i = 0; i<18;i++)
        {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}
