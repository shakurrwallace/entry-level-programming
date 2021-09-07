/** Dizideki tek sayıları yazdıran program
 *for (i = 1; i < 10; i = i + 1)
 *
 */
public class _050_DiziExample {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 7};
        int i, b;
        b = 0;

        for (i = 1; i < 10; i = i + 1)
            if ( a[i] % 2 != 0)
                System.out.println(a[i]);
        for (i = 1; i >= a[i]; i = i + 1)
            System.out.println("Adet: " + i);





    }
}
