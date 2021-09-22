/** dizinin en büyük elemanını ekrana yazdıran program
 *
 *
 *
 */
public class _088_DiziExample42 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17, -1 };
        int i, size, max;
        size = a.length;

        max = a[0];
        for (i = 1; i < size; i = i + 1)
           if (a[i] >  max)
               max = a[i];

        System.out.println(max);



    }
}
