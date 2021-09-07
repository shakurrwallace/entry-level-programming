/**Dizideki çift sayıları ekrana yazdıran program
 *
 *
 *
 *
 */
public class _059_DiziExample12 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i;
        for ( i = 0; i < 10; i = i + 1)
            if ( a[i] % 2 == 0)
                System.out.println("Dizideki çift sayılar: " + a[i]);

    }
}
