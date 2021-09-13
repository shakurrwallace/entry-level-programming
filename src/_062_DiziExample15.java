/** Dizideki minimum sayıyı bulan program
 *
 *
 *
 */
public class _062_DiziExample15 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, min;
        min = a[0];

        for (i = 1; i < 10; i= i + 1)
            if (min > a[i])
                min = a[i];



        System.out.println(min);


    }
}
