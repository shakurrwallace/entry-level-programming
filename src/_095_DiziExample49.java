/**Diziyi 5 kere alt alta yazdıran program
 *
 *
 *
 *
 */
public class _095_DiziExample49 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int i , k, size;

        size = 10;

        for (k = 0; k < 5; k = k + 1) {
            for (i = 0; i < size; i = i + 1)
                System.out.print(a[i] + " ");
                System.out.println();
        }
    }
}
