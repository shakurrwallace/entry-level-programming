/** a[] dizisindeki çift sayıları b[]dizisinin başına, tek sayıları b[] dizisinin sonuna atayan program
 *
 *
 *
 */
public class _087_DiziExample41 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int i, size, oddPosition, temp;
        size  = 10;
        oddPosition = 0;

        for (i = 0; i < size; i = i + 1 )
            if (a[i] % 2 != 0) {
                temp = a[i];
                a[i] = a[oddPosition];
                a[oddPosition] = temp;
                oddPosition = oddPosition + 1;
            }

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] +  " ");


    }
}
