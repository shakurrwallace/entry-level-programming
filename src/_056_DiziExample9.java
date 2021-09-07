/** tek sayıları yazdıran dizi programı
 *
 *
 *
 */
public class _056_DiziExample9 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i;

        for (i = 0; i < 5; i= i + 1)
            a[i] = (i * 2 ) + 1;

        for (i = 0; i < 5; i= i + 1)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
