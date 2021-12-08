/** a[] dizisindeki çift sayıları b[]dizisinin başına, tek sayıları b[] dizisinin sonuna atayan program
 *
 *
 *
 */
public class _087_DiziExample41 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size, oddPosition,evenPosition;
        size  = 10;
        oddPosition = size - 1;
        evenPosition = 0;

        for (i = 0; i < size; i = i + 1 )
            if (a[i] % 2 != 0) {
                b[oddPosition] = a[i];
                oddPosition = oddPosition - 1;
            }
            else {
                b[evenPosition] = a[i];
                evenPosition = evenPosition + 1;
            }

        for (i = 0; i < size; i = i + 1)
            System.out.print(" " + b[i]);


    }
}
