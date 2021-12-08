/** Dizinin son n adet elemanını baştan sona doğru yazdıran program 4 girildiğinde dizinin son 4 elemanı sırasıyla 21 20 5 17
 *
 *
 */
public class _071_DiziExample24 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, size ;
        size = 10;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = size - n; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
