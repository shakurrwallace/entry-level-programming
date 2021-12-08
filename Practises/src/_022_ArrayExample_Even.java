/**
 *    5 elemanlı a[] dizisine 2 den başlayan çift  sayıları atayan program
 *
 */
package src;

public class _022_ArrayExample_Even {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i, size;
        size = a.length;

        for(i = 0; i < size; i = i + 1)
            a[i] = (i + 1) * 2;
        for(i = 0; i < size; i = i + 1)
            System.out.print(" " + a[i]);

    }
}
