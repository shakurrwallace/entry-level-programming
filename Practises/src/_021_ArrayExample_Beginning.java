/**
 *      10 kere 7 yazdıran dizi programı.
 *
 *
 */
package src;

public class _021_ArrayExample_Beginning {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i, size;
        size = a.length;
        for(i = 0; i <size; i = i + 1)
            a[i] = 7;
        for(i = 0; i < size; i = i +1)
            System.out.print(" " + a[i]);
    }
}
