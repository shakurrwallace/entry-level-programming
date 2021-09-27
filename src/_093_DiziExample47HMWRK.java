/**Dizinin en büyük ve en küçük elemanını bulan program, 2) Dizinin en büyük ve en küçük elemanını yer değiştiren program
 *
 *
 */
public class _093_DiziExample47HMWRK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i,size, min, max;
        size = 10;

        min = a[0];
        max = a[0];
        for (i = 1; i < size; i = i + 1)
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];

            System.out.print("En küçük sayı: " + min + " en büyük sayı : " + max);

    }
}
