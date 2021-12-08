/** Dizinin tek sayılarını bir kere basan çift sayılarını 2 kere basan program
 *
 *
 *
 */
public class _102_DiziExample48 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k, size;

        size = a.length;
        for (i = 0; i < size; i = i + 1) {
            for (k = a[i] % 2; k <= 1; k = k + 1)
                System.out.print(a[i] + " ");
            System.out.println();
        }




    }
}
