/**Dİzinin en büyük elemanını ve indis numarasını bulan program
 *
 *
 */
public class _089_DiziExample43 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17, 1 };

        int i, size, max, index;

        size = a.length;
        index = 0;
        max = a[0];

        for (i = 1; i < size; i = i + 1)
            if (a[i] >  max) {
                max = a[i];
                index = i;
            }
        System.out.println("a[" + index + "] = "  + max);

    }
}
