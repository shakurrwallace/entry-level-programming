/**
 *
 *  a[] dizisindeki tek sayıları b dizisinin başına, çift sayıları b dizisinin sonuna atayan program
 *
 *
 */
package src;

public class _032_ArrayExample_AlgoEvenOdd {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size, oddPosition, evenPosition;
        size = a.length;

        oddPosition = 0;
        evenPosition = size - 1;

        for(i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0) {
                b[oddPosition] = a[i];
                oddPosition = oddPosition + 1;
            }
            else {
                b[evenPosition] = a[i];
                evenPosition = evenPosition - 1;
            }

            for(i = 0; i < size; i = i + 1)
                System.out.print(" " + b[i]);
    }
}
