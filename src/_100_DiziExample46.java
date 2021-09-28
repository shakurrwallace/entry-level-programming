/**  Diziyi 5 defa alt alta yazdıran program
 *
 *
 *
 */
public class _100_DiziExample46 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k, size ;
        size = a.length;

        for (k = 1; k <= 5; k = k + 1) {
            for (i = 0; i < size - 1; i = i + 1)
                System.out.print(a[i] + " ");
            System.out.println();
        }

    }
}
