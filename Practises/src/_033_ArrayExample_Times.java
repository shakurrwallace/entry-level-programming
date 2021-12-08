/**
 *   Dizinin her elemanını 5 kere yazdıran program
 *
 *
 */
package src;

public class _033_ArrayExample_Times {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k , size;
        size = a.length;

        for(i = 0; i < size; i = i + 1) {
            for (k = 0; k < 5; k = k + 1)
                System.out.print(a[i] + " ");
            System.out.println();
        }

    }
}
