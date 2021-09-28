/** Dizinin elemanlarını küçükten büyüğe sıralayan program
 *
 *
 */
public class _091_DiziExample45 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k, size, min, index;
        size = a.length;
        for (k = 0; k < size - 1; k = k + 1) {
            min = a[k];
            index = k;
            for (i = k + 1; i < size; i = i + 1)
                if (a[i] < min) {
                    min = a[i];
                    index = i;
                }
            a[index] = a[k];
            a[k] = min;
        }
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
