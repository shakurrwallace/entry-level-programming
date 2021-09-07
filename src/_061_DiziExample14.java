/**Dİzideki çift sayıları ve çift sayıların adetini ekrana yazdıran program
 *
 *
 *
 */
public class _061_DiziExample14 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum, cnt;
        sum = 0;
        cnt = 0;
        for (i = 0; i <10; i = i + 1)
           if (a[i] % 2 == 0) {
               System.out.println("Çift sayılar: " + a[i]);
               cnt = cnt + 1;
           }

        System.out.println("Adetleri: " + cnt);


    }
}
