/**
 *      Dizideki tek sayıları ekrana yazdıran program
 *
 *
 */
package src;

public class _024_ArrayExample_Odd {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 7};
        int i, size;
        size = a.length;
        for(i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0)
                System.out.print(" " + a[i]);
    }
}
