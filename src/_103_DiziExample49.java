/** Dizinin birinci elemanını 1 kez ikinci elemanını 2 kere, 3. elemanını 3 kere yazdıran program
 *
 *
 *
 */
public class _103_DiziExample49 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i , k, size;

        size = a.length;

        for (i = 0; i < size; i = i + 1) {
            for (k = 0; k <= i; k = k + 1)
                System.out.print(a[i] + " ");
            System.out.println();
        }


    }
}
