/**
 *Dizideki tek sayıların adetini, toplamını ve ortalamasını yazdıran program
 *
 */
public class _064_DiziExample17 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum, cnt, avg, size;
        sum = 0;
        cnt = 0;
        size = 10;
        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0) {
                sum = sum + a[i];
                cnt = cnt + 1;
            }
        System.out.println("Toplam: " + sum);
        System.out.println("Adeti: " + cnt);
        avg = sum / cnt;
        System.out.println("Ortalaması: " + avg);

    }
}



