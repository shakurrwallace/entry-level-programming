/**Dizinin her elemanını kendisi kadar yazdıran program
 *
 *
 */
public class _096_DiziExample51 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int i , k,size;

        size = 10;

        for (i = 0; i < size; i = i + 1) {
            for (k = 1; k <= a[i]; k = k + 1)

                System.out.print(a[i]+ " " );
                System.out.println();

        }
    }
}
