/** Dizinin en büyük ve en küçük elemanını yer değiştiren program
 *
 *
 */
public class _099_DiziExample45 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, max, min, pMax, pMin;

        size = a.length;
        max = a[0];
        min = a[0];
        pMax = 0;
        pMin = 0;

        for ( i = 1; i <size; i = i + 1)
            if (a[i] > max) {
                max = a[i];
                pMax = i; }
            else if (a[i] < min) {
                min = a[i];
                pMin = i;
            }

            a[pMin] = max;
            a[pMax] = min;


            System.out.println("pMin: " + pMin + " pMax:  " + pMax +  " ");
            System.out.println(" max: " + max + " min:  " + min);
        for(i = 0; i< size- 1; i = i + 1)
            System.out.print (a[i] + " ");





    }
}
