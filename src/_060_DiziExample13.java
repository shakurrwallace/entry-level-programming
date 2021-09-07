/** dizideki çift sayıların adetini ekrana yazan program
 *
 *
 *
 */
public class _060_DiziExample13 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, cnt;
        cnt = 0;

        for (i = 0; i < 10; i = i + 1)
            if (a[i] % 2 == 0)
                cnt = cnt + 1;

        System.out.println("Çİft adeti eşittir: " + cnt);
    }
}
