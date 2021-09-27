/**Dizinin her elemanını 5 kere yazdıran program
 *
 *
 *
 */
public class _096_DiziExample50 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int i , k,size;

        size = 10;

        for (i = 0; i < size; i = i + 1) {
            for (k = 1; k <= 5; k = k + 1)

                    System.out.print(a[i] + " ");
                    System.out.println();

        }

    }
}
