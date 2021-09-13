/**Klavyeden girilen sayıdan küçük tek ve çift dizi elemanlarının adetlerini ve toplamlarını ekrana ayrı ayrı yazdıran program
 *
 *
 */
public class _066_DiziExample19 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, n, size,cnt, cnt2, sum, sum2;
        size = 10;
        cnt = 0;
        sum = 0;
        sum2 = 0;
        cnt2 = 0;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = kb.nextInt();
        for (i = 0; i < size; i = i + 1 )
            if ( a[i] < n)
                if (a[i] % 2 == 0) {
                sum2 = sum2 + a[i];
                cnt2 = cnt2 + 1;
            }
            else {
            sum = sum + a[i];
            cnt = cnt + 1;
        }
        System.out.println("Çift sayılar toplamı: " + sum2);
        System.out.println("Çift sayılar adetleri: " + cnt2);
        System.out.println("Tek sayılar toplamı: " + sum);
        System.out.println("Tek sayılar adetleri: " + cnt);
    }
}
