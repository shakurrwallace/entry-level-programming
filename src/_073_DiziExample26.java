/** klavyeden s ve n giriliyor s nolu elemandan başlayacak n adet elemanı ekrana yazdıran program
 *
 * s 5 n 4 girildiğinde
 *
 */
public class _073_DiziExample26 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, s, size ;
        size = 10;

        System.out.println("S değeri giriniz: ");
        s = kb.nextInt();
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = s; i < s + n; i = i + 1)
            System.out.println(a[i] + " ");
    }
}
