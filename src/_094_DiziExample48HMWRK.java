/**Dizinin en büyük ve en küçük elemanını yer değiştiren program
 *
 */
public class _094_DiziExample48HMWRK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int i,size, min, max, pMax, pMin;

        size = 10;

        min = a[0];
        max = a[0];

        pMax = 0;
        pMin = 0;
        for (i = 1; i < size; i = i + 1)
            if (a[i] > max) {
                max = a[i];
                pMax = i;
            }
            else if (a[i] < min) {
                min = a[i];
                pMin = i;
                }

            a[pMax] = min;
            a[pMin] = max;
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}
