/** n klavyeden girilen 1 ile 10 arası bir sayıdır dizinin ilk n adet elemanını ekrana yazdıran program
 *
 *
 */
public class _070_DiziExample23 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, size ;
        size = 10;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
            System.out.println(a[i]);
    }
}
