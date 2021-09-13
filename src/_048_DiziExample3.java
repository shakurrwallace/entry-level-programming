/** Dizideki sayıların toplamı
 *
 *
 */
public class _048_DiziExample3 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 7};
        int i, sum;
        sum = 0;
        for (i = 0;i < 10; i = i + 1)
            sum = a[i] + sum;

        System.out.println("Toplamı: " + sum);



    }
}
