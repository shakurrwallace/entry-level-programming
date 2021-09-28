/** Dizinin her elemanını 5 defa yazdıran program
 *
 *
 */
public class _101_DiziExample47 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k, size;

        size = a.length;
        for (k = 0; k < size; k = k + 1) {
            for (i = 1; i <= 5; i = i + 1)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
