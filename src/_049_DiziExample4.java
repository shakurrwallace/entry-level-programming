/** Dizideki sayıların ortalaması
 *
 *
 */
public class _049_DiziExample4 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 7};
        int i, sum, avg;
        sum = 0;
        for (i = 1; i < 10; i = i + 1)
            sum = a[i] + sum;

        avg = sum / 10;
        System.out.println(avg);
        System.out.println(sum);
    }
}
