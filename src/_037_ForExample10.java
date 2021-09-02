public class _037_ForExample10 {
    public static void main(String[] args) {
        // 1 den 10 a kadar olan sayıların toplamını yazan program
        int i, sum;
        sum = 0;

        for (i = 1; i <= 10 ; i = i + 1)
            sum = sum + i;

        System.out.println(sum);
    }
}
