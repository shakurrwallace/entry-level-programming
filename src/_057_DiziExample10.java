/** DİZİNİN ELEMANLARININ TOPLAMLARINI EKRRANA YAZDIRAN PROGRAM DİZİNİZ ŞÖYLE BAŞLIYOR
 * İNT A[] = {4, 8, 3, 1, 18, 9, 21, 20 5, 17}
 *
 *
 */
public class _057_DiziExample10 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum;
        sum = 0;
        for (i = 0;i < 10; i = i + 1)
            sum = a[i] + sum;
        System.out.println("Toplamı = " + sum);

    }
}
