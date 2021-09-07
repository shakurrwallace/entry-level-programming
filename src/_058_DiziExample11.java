public class _058_DiziExample11 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum, avg, size;
        size = 10;
        sum = 0;
        for (i = 1; i < size; i = i + 1)
            sum = a[i] + sum;

        avg = sum / size;

        System.out.println(avg);
    }
}
