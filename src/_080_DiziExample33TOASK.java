/**klavyeden s ve n giriliyor dizinin s nolu elemanından başlayarak n adet elemanını kendi içinde bir öne kaydıran program
 * bu soruyu sor ****
 *
 */
public class _080_DiziExample33TOASK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, s, n, temp;
        size = 10;

        System.out.println("s değeri giriniz: ");
        s = kb.nextInt();

        System.out.println("n değeri giriniz: ");
        n = kb.nextInt();
        temp = a[s];

        for (i = s + 1; i < s + n; i = i + 1)
            a[i - 1] = a[i];

        a[s + n - 1] = temp;

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
