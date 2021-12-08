/**Klavyeden girilen sayıdan küçük tek ve çift dizi elemanlarının adetlerini ve toplamlarını ekrana ayrı ayrı yazdıran program
 *
 *
 */
public class _066_DiziExample19TOREPEAT {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, n, size,cntOdd, cntEven, sumOdd, sumEven;
        size = 10;
        cntOdd = 0;
        sumOdd = 0;
        sumEven = 0;
        cntEven = 0;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = kb.nextInt();
        for (i = 0; i < size; i = i + 1 )
            if ( a[i] < n)
                if (a[i] % 2 == 0) {
                    sumEven = sumEven + a[i];
                    cntEven = cntEven + 1;
                } else {
                    sumOdd = sumOdd + a[i];
                    cntOdd = cntOdd + 1;
                }
        System.out.println("Çift sayılar toplamı: " + sumEven);
        System.out.println("Çift sayılar adetleri: " + cntEven);
        System.out.println("Tek sayılar toplamı: " + sumOdd);
        System.out.println("Tek sayılar adetleri: " + cntOdd);
    }
}
