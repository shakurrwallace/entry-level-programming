/**Dizideki tek sayıların toplamını  ve tek sayıların adetini ekrana yazdıran program
 *
 *
 *
 */
public class _063_DiziExample16HWRK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum, cnt;
        sum = 0;
        cnt = 0;
        for (i = 0; i <10; i = i + 1)
            if (a[i] % 2 != 0) {
                sum = sum + a[i];
                cnt = cnt + 1;
            }
        System.out.println("Tek sayıların toplamı: " + sum);
        System.out.println("Adetleri: " + cnt);
    }
}
