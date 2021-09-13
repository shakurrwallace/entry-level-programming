/**Klavyeden girilen küçük sayının dizi elemanlarını ekrana yazdıran program
 *
 *
 */
public class _065_DiziExample18 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, n, size;
        size = 10;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = kb.nextInt();
        for (i = 0; i < size; i = i + 1 )
            if ( a[i] < n)
                System.out.println("Küçük sayılar: " + a[i]);

    }
}
