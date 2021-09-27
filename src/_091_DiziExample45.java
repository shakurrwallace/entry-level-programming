/** Dizinin elemanlarını küçükten büyüğe sıralayan program
 *
 *YAPILMADI!!!!
 */
public class _091_DiziExample45 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, min, line;
        size = a.length;

        min = a[0];
        line = 0;
        for (i = 1; i < size; i = i + 1)
            if (a[i] <  min) {
                min = a[i];
                line = i;
            }
        a[line] =a[0];
        a[0] = min;
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
